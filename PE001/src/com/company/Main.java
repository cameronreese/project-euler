package com.company;
/*
Project Euler Problem 1: Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Main {

    public static void main(String[] args) {
        int answer = 0;
        boolean found = false;
        for (int i = 0; i < 1000; i++) {
            if (i % 15 == 0){
                answer = answer + i;
                found = true;
            }
            if (i % 5 == 0 && !found){
                answer = answer + i;
                found = true;
            }
            if (i % 3 == 0 && !found){
                answer = answer + i;
            }
            found = false;
        }

        String solution = Integer.toString(answer);
        System.out.print(solution);
    }
}
