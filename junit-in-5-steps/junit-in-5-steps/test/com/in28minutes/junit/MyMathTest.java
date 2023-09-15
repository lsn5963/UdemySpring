package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray() {
        assertEquals(math.calculateSum(new int[]{1,2,3}),6);
    }
    @Test
    void calculateSum_ZeroLengthArray() {
        assertEquals(math.calculateSum(new int[]{}),0);
    }
}