package com.testing;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@NativeImageTest
public class NativeTest {

    @Test
    void testSomething() {
        assertEquals(true,true);
    }
}
