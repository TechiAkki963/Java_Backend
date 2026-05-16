
import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        int a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        a = sc.nextInt();
        b = sc.nextInt();
        x = a + b;

        System.out.println(x);
    }
}


// javac -d .. Main

// This can create the Main.class file in your desired folder , you can use file location insted of ..

