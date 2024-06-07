package org.shubham.sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import org.shubham.models.sec05.v3.TelevisionOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V3Parser {
    public static final Logger log = LoggerFactory.getLogger(V3Parser.class);

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
        var tv = TelevisionOuterClass.Television.parseFrom(bytes);
        log.info("brand: {}", tv.getBrand());
        log.info("type: {}", tv.getType());
    }
}
