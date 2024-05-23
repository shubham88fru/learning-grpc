package org.shubham.sec03;

import org.shubham.models.sec03.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec01Scalar {
    private static final Logger log = LoggerFactory.getLogger(Lec01Scalar.class);
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
        log.info("person: {}", person);
    }
}
