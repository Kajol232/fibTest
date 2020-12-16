package com.company;

public class Process {


    public int [] fib(int n){
        int [] fibArray = new int[n];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for(int i = 2; i < n; i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];

        }

        printArray(fibArray);
        return fibArray;
    }

    private static void printArray(int [] fib){
        for (int j : fib) {
            System.out.println(j);
        }
    }
}
