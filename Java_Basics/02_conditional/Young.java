import java.util.Scanner;

class Young{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the age of the person: ");
        int age = in.nextInt();

        if (age > 14 && age < 55){
            System.out.println("Young");
        }else{
            System.out.println("You are not young");
        }
    }
}