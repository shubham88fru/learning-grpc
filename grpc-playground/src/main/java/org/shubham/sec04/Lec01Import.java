package org.shubham.sec04;

import org.shubham.models.common.AddressOuterClass;
import org.shubham.models.common.CarOuterClass;
import org.shubham.models.sec04.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Lec01Import {

    private static final Logger log = LoggerFactory.getLogger(Lec01Import.class);
    public static void main(String[] args) {
        var address = AddressOuterClass.Address.newBuilder().setCity("Atlanta").build();
        var car = CarOuterClass.Car.newBuilder().setBodyStyle(CarOuterClass.BodyStyle.COUPE).build();

        var person = PersonOuterClass.Person.newBuilder()
                .setAge(12).setCar(car).setAddress(address).build();

        log.info("{}", person);
    }
}
