package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-10, calc.add(-5, -5));
    }
}

