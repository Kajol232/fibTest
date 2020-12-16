package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {

    @Test
    void main() {


    }

    @Test
    void testFib(){
        Process process = new Process();
        int expected [] = new int[]{0,1,1,2,3,5,8,13,21,34};
        assertArrayEquals( expected, process.fib(10));
    }

}