package org.shubham.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.shubham.models.PersonOuterClass;

public class SimpleProtoDemo {
    private static final Logger logger = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {
        PersonOuterClass.Person p = PersonOuterClass.Person
                .newBuilder().setAge(27).setName("Shubham").build();

        logger.info("{}", p);
    }
}
