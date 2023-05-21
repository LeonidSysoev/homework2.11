package pro.sky.homework211.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceMathImpl implements ServiceMath {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }
}
