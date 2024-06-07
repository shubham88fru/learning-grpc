package org.shubham.sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import org.shubham.models.sec05.v2.TelevisionOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V2Parser {
    public static final Logger log = LoggerFactory.getLogger(V2Parser.class);

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
        var tv = TelevisionOuterClass.Television.parseFrom(bytes);
        log.info("brand: {}", tv.getBrand());
        log.info("model: {}", tv.getModel());
        log.info("type: {}", tv.getType());
    }
}
