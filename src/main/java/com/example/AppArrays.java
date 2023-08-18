package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){
       // int x = 10;
        //double vetor[] = {10, 20, 30};
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 100 * (i+1);
        }
        System.out.println (Arrays.toString(vetor));


    }
}
