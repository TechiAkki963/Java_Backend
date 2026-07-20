
class CheckNumBinaryORNOT
{
    public static void main(String[] args) {

        int b = 1000110;
        String str = String.valueOf(b); 
        // first we have to convert the binary to string 
        // then match the strings if they have 0's and 1's
        System.out.println(str);
        System.out.println(str.matches("[01]+"));

        String strh= "234AB";
        System.out.println(strh.matches("[0-9A-F]+"));

        String date = "28/01/1985";
        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));





    }
}