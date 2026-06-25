import java.util.*;

class Fibonacci{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Fibonacci Series");
        System.out.println("Enter value of n");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+ ", "+b+", ");

        for (int i = 0 ; i < n; i++){
            c = a + b;
            System.out.print(c+", ");
            a = b;
            b = c;
        }





    }





}