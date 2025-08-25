package com.myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
    }
}
