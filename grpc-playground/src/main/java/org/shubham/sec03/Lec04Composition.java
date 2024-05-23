package org.shubham.sec03;

import org.shubham.models.sec03.Composition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec04Composition {
    private static final Logger logger = LoggerFactory.getLogger(Lec04Composition.class);

    public static void main(String[] args) {
        var address = Composition.Address.newBuilder()
                .setStreet("123 main st")
                .setCity("Atlanta")
                .setState("GA")
                .build();

        var student = Composition.Student.newBuilder()
                .setName("sam")
                .setAddress(address)
                .build();

        var school = Composition.School.newBuilder()
                .setId(1)
                .setName("High school")
                .setAddress(address.toBuilder().setStreet("234 main st").build())
                .build();

        logger.info("School: {}", school);
        logger.info("Student: {}", student);
    }
}
