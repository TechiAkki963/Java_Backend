import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of BASE HEIGHT AREA: ");
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = 0.5f * (a * b);

        System.out.println("The Area of triangle : "+ c);






    }
}