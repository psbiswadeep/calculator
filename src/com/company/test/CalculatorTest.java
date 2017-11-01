package com.company.test;

import com.company.Calculator;

public class CalculatorTest {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 5);
        assert result == 6 : " Addition test fail";
    }
}
