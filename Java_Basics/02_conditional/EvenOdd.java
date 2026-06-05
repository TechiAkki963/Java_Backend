
import java.util.Scanner;

class EvenOdd{

    public static void main(String args[]){
    
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter the value for n: ");
        int n = in.nextInt();

        if (n % 2 == 0){
            System.out.println("It is a Even Number");
        }else{
            System.out.println("It is a Odd Number");
        }

    }
}