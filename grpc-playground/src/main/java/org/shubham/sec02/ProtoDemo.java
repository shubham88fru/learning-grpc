package org.shubham.sec02;

import org.shubham.models.sec02.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoDemo {

    private static final Logger log = LoggerFactory.getLogger(ProtoDemo.class);

    public static void main(String[] args) {
        var person1 = createPerson();
        var person2 = createPerson();

        log.info("equals {}", person1.equals(person2)); //true
        log.info("== {}", (person1 == person2)); //false

        //create another instance with diff values
        var person3 = person1.toBuilder().setName("mike").build();
        log.info("equals {}", person1.equals(person3)); //false
        log.info("== {}", (person1 == person3)); //false

        //nulling a property
        var person4 = person1.toBuilder().clearName().build();
        log.info("person4: {}", person4);
    }

    private static PersonOuterClass.Person createPerson() {
        return PersonOuterClass.Person.newBuilder()
                .setName("sam")
                .setAge(12)
                .build();
    }
}
