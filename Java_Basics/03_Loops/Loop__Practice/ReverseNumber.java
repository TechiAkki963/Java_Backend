
import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int r, rev = 0;
        
        while(n>0){

            r = n%10;
            rev = (rev * 10) + r;
            n=n/10;
            // System.out.println(rev);
        }
        System.out.println(rev);

    }
}