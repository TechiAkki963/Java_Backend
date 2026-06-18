
import java.util.*;

class NumberTOText{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        int r, rev = 0;
      
        String str = "";
        while (n > 0){
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;

            str =  str + r;


            
        }
            System.out.println(rev);
            System.out.println(str);
            System.out.println(n); // checking the value of n

        char c;

        for (int i=str.length()-1; i>=0;i--){
            c = str.charAt(i);

            switch(c)
            {
                case '0' -> System.out.print(" Zero");
            
                case '1' -> System.out.print(" One");
            
                case '2' -> System.out.print(" Two");
            
                case '3' -> System.out.print(" Three");
            
                case '4' -> System.out.print(" Four");
            
                case '5' -> System.out.print(" Five");
            
                case '6' -> System.out.print(" Six");
        
                case '7' -> System.out.print(" Seven");

                case '8' -> System.out.print(" Eight");

                case '9' -> System.out.print(" Nine");

                default -> System.out.println("Err!");
            }
        }
       
           

        }


    }
