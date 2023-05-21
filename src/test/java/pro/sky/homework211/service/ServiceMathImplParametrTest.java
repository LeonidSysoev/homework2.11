package pro.sky.homework211.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ServiceMathImplParametrTest {
    static ServiceMath serviceMath;

    @BeforeAll
    static void beforeAll() {
        serviceMath = new ServiceMathImpl();
    }

    private static Stream<Arguments>parametr(){
        return Stream.of(
                Arguments.of(10, 7),
                Arguments.of(-5, 8),
                Arguments.of(-5, -5),
                Arguments.of(10, -20));
    }



    @ParameterizedTest
    @MethodSource("parametr")

    void plus(int num1, int num2) {
        int actual = serviceMath.plus(num1, num2);
        int expected  =num1 + num2;
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @MethodSource("parametr")
    void minus(int num1, int num2) {
        int actual = serviceMath.minus(num1, num2);
        int expected  =num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parametr")
    void multiply(int num1, int num2) {
        int actual = serviceMath.multiply(num1, num2);
        int expected  =num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parametr")
    void divide(double num1, double num2) {
        double actual = serviceMath.divide(num1, num2);
        double expected  =num1 / num2;
        assertEquals(expected, actual);
    }
}