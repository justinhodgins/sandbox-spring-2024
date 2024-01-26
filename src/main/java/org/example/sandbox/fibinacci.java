package org.example.sandbox;

import java.util.HashMap;
import java.util.Map;

public class fibinacci {

     private Map< Integer, Long> dictionary;

     public fibinacci(){
         this.dictionary = new HashMap<>();
     }
    public static void main(String[] args) {

        fibinacci fn = new fibinacci();

        for(int x= 0; x <= 15; x++){
            System.out.println("fib(" + x + ") = " + fn.fib(x));
        }

    }

    private long fib(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1 ;
        }
        return fib(n-1) + fib(n-2);
    }

    private long memo (int m){

        long value = dictionary.get(m);

        if (value != 0){
            return value;
        }
        return value;
    }
}

