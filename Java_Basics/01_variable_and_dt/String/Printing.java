public class Printing
{
    public static void main(String args[]){

        int x = 10, y = 20;

        System.out.println("Sum of "+ x + " and "+ y + " is " +(x+y)); 


        int a = 10;
        float b = 12.56f;
        char c = 'A';
        String str = "Java Program";

        System.out.printf("Hello %d %f %c World\n", a, b, c);
        // %d for int
        // %f for float
        // %c for character

        System.out.printf("Hello %s \n", str);
        // %s for string

        System.out.printf("%1$s %2$d %1$s", str , x);
        // index 

        float p = 3.14356768f;
        System.out.printf("\n %6.2f",p);
        // here 6 is the space occupied by the number and the empty space
        // .2 is for the precision
    }
}