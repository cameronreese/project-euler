public class Main {

    public static void main(String[] args) {
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

        String solution = Integer.toString(answer);
        System.out.print(solution);
    }
}
