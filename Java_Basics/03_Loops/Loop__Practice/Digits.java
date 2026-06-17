import java.util.Scanner;

class Digits{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int r;  //remainder

        while(n > 0){

            r = n % 10; // This gives us the last digit of a number as a remainder
            n = n /10;  // This splits the number removing the last digit for e.g.  257 /10 = 25--> which goes for next loop
            System.out.println(r);

        }

        


    }
}