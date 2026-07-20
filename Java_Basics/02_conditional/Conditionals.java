import java.util.Scanner;

class Conditionals{
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter value for a:");
        int a = in.nextInt();
        System.out.println("Enter value for b:");
        int b = in.nextInt();
        System.out.println("Enter value for c:" );
        int c = in.nextInt();
        

        if (a>b && a>c){
            System.out.println("a is Largest Number");
        }else if (b > c){
            System.out.println("b is Largest Number");
        }else{
            System.out.println("c is the Largest Number");
        }
        


    }

}