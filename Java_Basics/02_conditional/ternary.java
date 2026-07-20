class ternary
{
    public static void main(String a[]){

        int x = 7;
        int result = 0;

        // if (x % 2 == 0){
        //     result = 10;
        // }else{
        //     result = 20;
        // }

        // ternary
        result = x % 2 == 0? 10 : 20; 
        System.out.println(result);

    }
}