import java.util.Scanner;

class Count{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0 ; // to keep the track of count of digits


        while(n > 0){
            n = n/10;
            count ++;
        }

        System.out.println(count);  // as the count is store outside


    }

}