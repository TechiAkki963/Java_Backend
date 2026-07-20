class CheckStringExpression{

    public static void main(String[] args) {
        // Remove special character
        String str = "a!B@c#1$2%3";
        String result = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result);

        //Remove extra spaces
        String str1 = "   abc    de  fgh  ijk   ";
        String result1 = str1.replaceAll("[\\s+]","").trim();
        System.out.println(result1);

        // Find number of words in a String
        String str2 = "   abc    de  fgh  ijk   ";
        str2 = str2.replaceAll("[\\s+]"," ").trim();
        String words[] = str2.split("\\s");
        System.out.println(words.length);


    }


}