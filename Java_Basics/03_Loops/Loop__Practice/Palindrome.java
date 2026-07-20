
import java.util.Scanner;

class Palindrome{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int m = n;
        int r, rev = 0;

        while(n>0){

            r = n % 10;
            rev = (rev * 10)+ r;
            n = n /10;
        }
        if (m == rev){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }


    }


}