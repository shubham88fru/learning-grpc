package org.shubham.sec04;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import org.shubham.models.sec04.WellKnown;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class Lec02WellKnownTypes {

    private static final Logger log = LoggerFactory.getLogger(Lec02WellKnownTypes.class);
    public static void main(String[] args) {
        var sample = WellKnown.Sample.newBuilder()
                .setAge(Int32Value.of(12))
                .setLoginTime(Timestamp.newBuilder()
                        .setSeconds(Instant.now().getEpochSecond()
                        ).build());

        log.info("{}", Instant.ofEpochSecond(sample.getLoginTime().getSeconds()));
    }
}
