package org.shubham.sec03;

import org.shubham.models.sec03.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lec02Serialization {
    private static final Logger log = LoggerFactory.getLogger(Lec02Serialization.class);
    private static final Path PATH = Path.of("person.out");

    public static void main(String[] args) {
        var person = PersonOuterClass.Person.newBuilder()
                .setLastName("sam")
                .setAge(12)
                .setEmail("sam@gmail.com")
                .setEmployed(true)
                .setSalary(1000.2234)
                .setBankAccountNumber(123456789012L)
                .setBalance(-10000)
                .build();


    }

    public static void serialize(PersonOuterClass.Person person) throws IOException {
        try(var stream = Files.newOutputStream(PATH)) {
            person.writeTo(stream);
        }
    }

    public static PersonOuterClass.Person deserialize() throws IOException {
        try(var stream = Files.newInputStream(PATH)) {
            return PersonOuterClass.Person.parseFrom(stream);
        }
    }
}
