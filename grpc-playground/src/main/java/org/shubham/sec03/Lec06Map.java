package org.shubham.sec03;

import org.shubham.models.sec03.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec06Map {

    private static final Logger logger = LoggerFactory.getLogger(Lec06Map.class);

    public static void main(String[] args) {
        var car1 = Map.Car.newBuilder()
                .setMake("Honda")
                .setModel("civic")
                .setYear(2000)
                .setBodyStyle(Map.BodyStyle.COUPE)
                .build();

        var car2 = Map.Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2002)
                .setBodyStyle(Map.BodyStyle.SEDAN)
                .build();

        var dealer = Map.Dealer.newBuilder()
                .putInventory(car1.getYear(), car1)
                .putInventory(car2.getYear(), car2).build();

        logger.info("{}", dealer);
    }
}
