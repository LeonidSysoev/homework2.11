package pro.sky.homework211.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceMathTest {
    static ServiceMath serviceMath;

    @BeforeAll
    static void beforeAll() {
        serviceMath = new ServiceMathImpl();
    }


    @Test
    void testPlus() {
        int result = serviceMath.plus(10, 10);
        assertEquals(20, result);
        int result2 = serviceMath.plus(-10, 10);
        assertEquals(0, result2);
        int result3 = serviceMath.plus(-5, -5);
        assertEquals(-10, result3);
    }

    @Test
    void testMinus() {
        int result = serviceMath.minus(15, 10);
        assertEquals(5, result);
        int result2 = serviceMath.minus(-10, 10);
        assertEquals(-20, result2);
        int result3 = serviceMath.minus(-5, -5);
        assertEquals(0, result3);
    }

    @Test
    void testMultiply() {
        int result = serviceMath.multiply(15, 10);
        assertEquals(150, result);
        int result2 = serviceMath.multiply(-10, 10);
        assertEquals(-100, result2);
        int result3 = serviceMath.multiply(-5, -5);
        assertEquals(25, result3);
    }

    @Test
    void testDivide() {
        double result = serviceMath.divide(15, 10);
        assertEquals(1.5, result);
        double result2 = serviceMath.divide(-10, 10);
        assertEquals(-1, result2);
        double result3 = serviceMath.divide(-25, -5);
        assertEquals(5, result3);
    }
    @Test
    void testDivideShouldIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, ()->serviceMath.divide(15, 0));
    }
}