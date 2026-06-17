import java.util.Scanner;

class Armstrong{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n;  // copying the value of n into m , as by the end of the loop n becomes 0
        int r;
        int sum = 0;

        // here we are using do while as we want the loop to print the sum atleast once 
        do{
            r = n % 10;
            sum = sum + (r*r*r);
            n = n / 10;

        } while(n>0);

        System.out.println(sum);

        if(m == sum){
            System.out.println("Its a Armstrong Number");
        }else{
             System.out.println("Its NOT a Armstrong Number");
        }











    }




}