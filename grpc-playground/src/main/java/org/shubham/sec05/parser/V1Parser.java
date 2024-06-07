package org.shubham.sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import org.shubham.models.sec05.v1.TelevisionOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V1Parser {
    public static final Logger log = LoggerFactory.getLogger(V1Parser.class);

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
        var tv = TelevisionOuterClass.Television.parseFrom(bytes);
        log.info("brand: {}", tv.getBrand());
        log.info("year: {}", tv.getYear());
    }
}
