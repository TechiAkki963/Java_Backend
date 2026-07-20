public class Swapping
{
    public static void main(String args[]){

        int a = 10, b=15;
        // a = 0b1010
        // b = 0b1111

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Value of a: "+ a);
        System.out.println("Value of b: "+ b);

    }
}