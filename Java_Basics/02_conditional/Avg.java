import java.util.Scanner;
class Avg{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();

        float avg = (float)(m1 + m2 + m3) / 3;

        if (avg >= 70){
            System.out.println("A");
        }else if(avg<70 && avg >=60){
            System.out.println("B");
        }else if(avg<60 && avg >=50){
            System.out.println("C");
        }else if (avg<50 && avg >=40){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}