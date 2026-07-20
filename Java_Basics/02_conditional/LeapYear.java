import java.util.Scanner;

class LeapYear{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        Integer year = in.nextInt();

        if(year % 4 == 0){
                if (year % 100 == 0){
                    if(year % 400 == 0){

            
                    }

                }
                System.out.println("It is a Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }


    }



