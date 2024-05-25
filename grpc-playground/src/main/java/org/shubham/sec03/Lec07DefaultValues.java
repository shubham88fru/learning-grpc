package org.shubham.sec03;

import org.shubham.models.sec03.Composition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec07DefaultValues {
    private static final Logger logger = LoggerFactory.getLogger(Lec07DefaultValues.class);

    public static void main(String[] args) {
        var school = Composition.School.newBuilder().build();
        //int --> 0
        //all objects etc have a default value of empty.
        //Proto doesn't have nulls.
        //To check if a particular field has a valid value of default value, use - has.
        logger.info("has address {} ?", school.hasAddress());
    }
}
