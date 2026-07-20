
import java.util.Scanner;

class ArrayP_2{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int A[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int key;

        System.out.println("Enter the value for key: ");
        key = in.nextInt();


        for (int i = 0; i < A.length; i++){

            if (A[i] == key){
                System.out.println("Found the element "+ A[i]);
                System.exit(0);
            }

        }
        System.out.println("Element NOT found!");


    }




}