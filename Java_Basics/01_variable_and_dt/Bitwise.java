public class Bitwise{

    public static void main(String[] args) {
        int a=10, b=6, c;
        c = a & b;
        System.out.println(c);
        // we can also write a=0b1010 b=0b0010 
        // Here a = 10
        // Binary of a - 00001010
        // b = 6
        // Binary of b - 00000110
        // a & b for &operator 0 0 0 | 1 0 0 | 0 1 0 | 1 1 1 | 
        // 00001010
        // 00000110
        // 00000010  -- value for c -- 2

        int d;
        d = a | b;
        System.out.println(d);

        // Here a = 10
        // Binary of a - 00001010
        // b = 6
        // Binary of b - 00000110
        // a | b for |operator 0 0 0 | 1 0 1 | 0 1 1 | 1 1 1 | 
        // 00001010
        // 00000110
        // 00001110  -- value for d -- 14


        // Important XOR
        int e;
        e = a^b;
        System.out.println(e);

        // Here a = 10
        // Binary of a - 00001010
        // b = 6
        // Binary of b - 00000110
        // a ^ b for XOR^operator 0 0 0 | 1 0 1 | 0 1 1 | 1 1 0 | 
        // 00001010
        // 00000110
        // 00001100  -- value for e -- 12


        int i =-0b1010;
        int j;
        j = i >> 1;
        System.out.println(j);

        // Here i = 0b1010;
        // i>>1 right shift by 1 space and black space as 0
        // so 0b1010 
        //      00101 -- 5
        System.out.println(String.format("%s",Integer.toBinaryString(i)));
        System.out.println(String.format("%32s",Integer.toBinaryString(j)));

        //for i=-0b1010 11111111111111111111111111110110
        // j -- 11111111111111111111111111111011

    }


}