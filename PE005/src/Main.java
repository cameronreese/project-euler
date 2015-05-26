import java.util.LinkedList;
import java.lang.Long;
/*
PE005 Project Euler Problem Five: Smallest Multiple
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Long> multiples = new LinkedList<Long>();
        //populate a list with numbers from 20 to 11
        for (long i = 20; i >= 11; i--){
            multiples.add(i);
        }

        long current_product = multiples.getFirst();     //take care of multiples 20 and 1
        multiples.remove(0);                             //remove the multiple 20

        long temp_product;
        while (multiples.size() > 0) {

            //iterate thru list and remove any multiple that is a multiple of the current product
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

