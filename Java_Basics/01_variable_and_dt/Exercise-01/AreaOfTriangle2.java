
import java.util.Scanner;

class AreaOfTriangle2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        float s;
        double area;

        System.out.println("Enter the value of each side ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a + b + c)/2f;
        System.out.println("The value for s: " + s);

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area : " + area);






    }

}