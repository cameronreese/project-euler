/*
Project Euler Problem 4: Largest Palindrome Product
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Main {

    public static void main(String[] args) {
        String solution = "Not Found";
        int facHigher = 999;
        int facLower = facHigher;
        int pali = facHigher * facLower;
        boolean largestPalidromeFound = false;

        while (!largestPalidromeFound) {
            if (isPalidrome(pali)){
                facHigher = (int)Math.sqrt(pali) + 1;
                facLower = facHigher;

                while (facHigher < 1000 && facLower >= 100){
                    if (facHigher * facLower == pali) {
                        solution = (Integer.toString(facHigher) + " x " + Integer.toString(facLower) + " = " + Integer.toString(pali));
                        largestPalidromeFound = true;
                    }
                    facHigher++;
                    facLower--;
                }
            }
            pali--;
        }
         System.out.print(solution);
    }

    //Returns whether or not an integer is a palidrome (used in problem 4)
    private static boolean isPalidrome(int num){
        String n = Integer.toString(num);

        for (int i = 0; i <= n.length()/2; i++){
            if (n.charAt(i) != n.charAt(n.length()-(i+1)))
                return false;
        }
        return true;
    }
}
