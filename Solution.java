/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.LinkedList;
import java.math.*;
/**
 *
 * @author MBA11
 */
public class Solution {
    
    public String calculateSolution(String problemID){
        String solution = "NOT SOLVED YET";
        
        //find the solution to which problem...
        
        //Problem 1
        if (problemID.equals("problem1")){
            //code to solve solution here
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
            
            return solution = Integer.toString(answer);
        }
        //Problem 2
        else if (problemID.equals("problem2")){
            int f = 1;
            int g = 1;
            int temp;
            int answer = 0;
            
            while (f < 4000000){
                temp = f;
                f = f + g;
                g = temp;
                //add all the even fib numbers
                if (f % 2 == 0){
                    answer = answer + f;
                }
            }
            
            return solution = Integer.toString(answer);
        }
        //Problem 3
        else if (problemID.equals("problem3")){
            long num = 600851475143L;
            
            LinkedList<Long> primes = new LinkedList();
            
            for (long i = 2; i < num; i++){               
                if (num % i == 0 && isPrime(i)){
                    
                    primes.add(i);
                    long product = 1;
                    for (Long p : primes){
                        product = product * p;
                    }
                    if (product == num) return solution = Long.toString(i);
                }
            }
            
            return solution;
        }
        //Problem 4
        else if (problemID.equals("problem4")){
             int facHigher = 999;
             int facLower = facHigher;
             int pali = facHigher * facLower;
             boolean largestPalidromeFound = false;
             
             while (!largestPalidromeFound) {
                 if (isPalidrome(pali)){
                     facHigher = (int)Math.sqrt(pali) + 1;
                     facLower = facHigher;
                     
                     while (facHigher < 1000 && facLower >= 100){
                         if (facHigher * facLower == pali) return (Integer.toString(facHigher) + " x " + Integer.toString(facLower) + " = " + Integer.toString(pali));
                         facHigher++;
                         facLower--;
                     }
                 }
                 pali--;
             }
            return solution;
        }
        // else if until problem is found
        
        else return solution;
        
    }
    
    //Lets you know whether or not a number is a prime number (used in problem 3)
    private boolean isPrime(long n){
        for (int i = 2; i < n/2; i++){
            if (n == 2 || n == 3) return true;
            if (n % i == 0) return false;
        }
        return true;
    }
    
    //Returns whether or not an integer is a palidrome (used in problem 4)
    private boolean isPalidrome(int num){
        String n = Integer.toString(num);
        
        for (int i = 0; i <= n.length()/2; i++){
            if (n.charAt(i) != n.charAt(n.length()-(i+1)))
                return false;
        }
        return true;
    }
    
    
}
