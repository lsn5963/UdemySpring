package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    @Test
    void test() {
        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        System.out.println("result = " + result);
        int expectedResult = 5;
        assertEquals(result,expectedResult);
    }
}