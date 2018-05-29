package com.example.demo.domain;

public class Fibonacci {

    public static int getResult(int input) throws Exception {
        if (input <= 0) {
            throw new Exception("Invalid Input Number");
        }
        if (input == 1 || input == 2) {
            return 1;
        }
        return getResult(input - 1) + getResult(input - 2);
    }
}