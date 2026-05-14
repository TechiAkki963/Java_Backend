import java.util.*;  // for using scanner import java.util

class ReadKeyboard
{
    public static void main(String args[]){
        //Scanner obj
        Scanner sc = new Scanner(System.in); //System.in is associated with keyboard
        
        int a,b,c;

        System.out.println("Enter 2 numbers");

        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;

        System.out.println("Sum is "+ c);


        


    }
}