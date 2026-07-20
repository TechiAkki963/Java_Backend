
import java.util.Scanner;

class conditional
{
    public static void main(String a[]){

        int x = 8;
        int y = 7;
        int z = 16;
        
       if (x > y && x > z){
        System.out.println(x);
       }else if (y > z){
        System.out.println(y);
       }else{
        System.out.println(z);
       }



       int salary = 25_000;
       if (salary >= 10_000){
         salary = salary + 1_000;
       }else if (salary >= 15_000 ) {
        salary = salary + 2_000;
       }else{
        System.out.println("Not Eleigible for bonus");
       }
       System.out.println(salary);



      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      for (int num = 1; num <= n; num++){
          System.out.println(num);
       }



    //    while loops

    // int num1 = 1;

    // while(num1 >=  5){
    //     System.out.println("hello");
    // }
    // num1 += 1;


    // do while

    // int n1 =1;
    // do {
    //     System.out.println("try me!");
    //     n1++;
    // }while(n1 !=1);

    }
}