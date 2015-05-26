import java.util.LinkedList;
import java.lang.Long;
/*
PE005 Project Euler Problem Five: Smallest Multiple
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Main {

    public static void main(String[] args) {
//        int multiples_of_20[] = {20, 10, 5, 4, 2, 1};
//        int multiples_of_18[] = {18, 9, 6, 3, 2, 1};
//        int multiples_of_16[] = {16, 8, 4, 2, 1};
//        int multiples_of_15[] = {15, 5, 3, 1};
//        int multiples_of_14[] = {14, 7, 2, 1};
//        int multiples_of_12[] = {12, 6, 4, 3, 2, 1};
//        int prime_numbers_less_than_twenty[] = {19, 17, 13, 11, 7, 3, 2};

        //20 thru 11 contain all the multiples for 10 thru 1
        //calculate 20 times 19 then check if any of the other numbers are multiples of the product, if they are not
        boolean smallest_multiple_not_found = true;
        LinkedList<Long> multiples = new LinkedList<Long>();
        //populate a list with numbers from 20 to 11
        for (long i = 20; i >= 11; i--){
            multiples.add(i);
        }


        long current_product = multiples.getFirst();     //take care of multiples 20 and 1
        multiples.remove(0);

        while (multiples.size() > 0) {
            current_product *= multiples.getLast();

            //iterate thru list and remove any multiple that is a multiple of the current product
            for (int i = 0; i < multiples.size(); i++) {
                if (current_product % multiples.get(i) == 0) {
                    multiples.remove(i);
                }
            }
        }
        System.out.print(current_product);
    }

}

