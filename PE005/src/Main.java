import java.util.LinkedList;
import java.lang.Long;
/*
PE005 Project Euler Problem Five: Smallest Multiple
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/*
Strategy: since every number half of a 20 or less is a multiple of at least one of the numbers between half of twenty
and twenty, then we just need to make sure that the number we are trying to find is a multiple of the numbers of 11 thru
20

The smallest number would be the number that is multiplied by all the multiples that are not redundant, meaning that a
number may be a multiple of more than one of the numbers between 11 and 20. There is no need to check every number, only
the products of the multiples.
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Long> multiples = new LinkedList<Long>();

        // populate a list with numbers from 20 to 11, creating a list of all the potential multiples
        for (long i = 20; i >= 11; i--){
            multiples.add(i);
        }

        long current_product = multiples.getFirst();     // take care of multiples 20 and 1
        multiples.remove(0);                             // remove the multiple 20 since it has been accounted for

        long temp_product;

        /* now we are going to create a new product from the next multiple and then test to see if any of the other
        multiples in the list are multiples of this new product, and if they are remove them from the list so that they
        are not used again to increase the current running product
         */
        while (multiples.size() > 0) {

            // iterating thru list and removing any multiple that is a multiple of the current product
            temp_product = current_product;
            for (int i = 0; i < multiples.size(); i++) {
                for (int j = 1; j <= 20; j++){
                    temp_product *= j;
                    if (temp_product % multiples.get(i) == 0) {
                        multiples.remove(i);
                        current_product *= j;
                        j = 21;
                    }
                    temp_product = current_product;
                }
            }
        }
        System.out.print(current_product);
    }
}

