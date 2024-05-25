package org.shubham.sec03;

import org.shubham.models.sec03.OneOf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec08OneOf {
    private static final Logger logger = LoggerFactory.getLogger(Lec08OneOf.class);

    public static void main(String[] args) {
        var email = OneOf.Email.newBuilder().setAddress("sam@sm.com").setPassword("admin").build();
        var phone = OneOf.Phone.newBuilder().setNumber(1234585994).setCode(123).build();
        login(OneOf.Credentials.newBuilder().setEmail(email).build());
        login(OneOf.Credentials.newBuilder().setPhone(phone).build());
    }

    private static void login(OneOf.Credentials credentials) {
        switch (credentials.getCredCase()) {
            case EMAIL -> logger.info("email - {}", credentials.getEmail());
            case PHONE -> logger.info("phone - {}", credentials.getPhone());
        }
    }
}
