import java.util.LinkedList;
/*
Project Euler Problem 3: Largest Prime Factor
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Main {

    public static void main(String[] args) {
        long num = 600851475143L;
        String solution = "Not Found";

        LinkedList<Long> primes = new LinkedList();

        for (long i = 2; i < num; i++){
            if (num % i == 0 && isPrime(i)){

                primes.add(i);
                long product = 1;
                for (Long p : primes){
                    product = product * p;
                }
                if (product == num) {
                    solution = Long.toString(i);
                    i = num;
                }
            }
        }
        System.out.print(solution);
    }



    //Lets you know whether or not a number is a prime number (used in problem 3)
    private static boolean isPrime(long n){
        for (int i = 2; i < n/2; i++){
            if (n == 2 || n == 3) return true;
            if (n % i == 0) return false;
        }
        return true;
    }
}


