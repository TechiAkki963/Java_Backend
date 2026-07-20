class DataSizeRange 
{
    public static void main(String args[]){

        // to get this .MIN_VALUE or other values - use command - javap java.lang.Integer in CMD

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.BYTES);     // 4


        System.out.println(Byte.MIN_VALUE);  // -128
        System.out.println(Byte.MAX_VALUE);  // 127
        System.out.println(Byte.BYTES);      // 1


        System.out.println(Float.MIN_VALUE);  // 1.4E-45
        System.out.println(Float.MAX_VALUE);  // 3.4028235E38
        System.out.println(Float.BYTES);      // 4
    }
}