class Datatypes
{
    public static void main(String a[]){
        int i = 9;
        byte by = 127;
        short sh = 558;
        long l = 5858l;

        float f = 5.8f;
        double db = 5.8;

        char ch = 'k';

        boolean b = true;

        // Type coersion and Casting

        // byte bi = 127;
        int x = 257;
        byte k = (byte) x;

        System.out.println(k);
        // as the value of x 257 is higher than the byte range it will give us % (257%256)

        float fl = 5.6f;
        int t = (int) fl;
        System.out.println(t);



        //Type Promotion
        byte c =  10;
        byte d = 30;
        int result = c * d;
        System.out.println(result);

    // Comparison Operator
    // < , > , <=, >= , !=, ==
    // & AND ,  || OR , ! NOT

    int p = 5;
    int q = 7;

    boolean result1 = p < q;

    System.out.println(result1);
   
   
    }
}