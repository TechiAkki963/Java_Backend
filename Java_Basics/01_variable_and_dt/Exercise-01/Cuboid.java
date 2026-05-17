import java.util.Scanner;

class Cuboid{

    public static void main(String[] args) {
        
        int l, b, h;
        int area_of_cuboid, volume_of_cuboid;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of length, breadth and height");

        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        area_of_cuboid = 2*(l*b + b*h + l*h);
        volume_of_cuboid =  l*b*h;

        System.out.println("Area: "+ area_of_cuboid);
        System.out.println("Volume: "+ volume_of_cuboid);
    }

}