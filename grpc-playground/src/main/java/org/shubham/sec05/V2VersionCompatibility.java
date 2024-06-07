package org.shubham.sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import org.shubham.models.sec05.v2.TelevisionOuterClass;
import org.shubham.sec05.parser.V1Parser;
import org.shubham.sec05.parser.V2Parser;
import org.shubham.sec05.parser.V3Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V2VersionCompatibility {
    private static final Logger log = LoggerFactory.getLogger(V2VersionCompatibility.class);

    public static void main(String[] args) throws InvalidProtocolBufferException {
        var tv = TelevisionOuterClass.Television.newBuilder()
                        .setBrand("samsung")
                        .setModel(2019)
                .setType(TelevisionOuterClass.Type.UHD).build();

        V1Parser.parse(tv.toByteArray());
        V2Parser.parse(tv.toByteArray());
        V3Parser.parse(tv.toByteArray());
    }
}
