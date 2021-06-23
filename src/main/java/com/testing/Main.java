package com.testing;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.jboss.logging.Logger;

@QuarkusMain
public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);
    public static void main(String... args) {
        LOG.info("starting");
        Quarkus.run(args);
    }
}
