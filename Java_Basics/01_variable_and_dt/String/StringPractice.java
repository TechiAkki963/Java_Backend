class StringPractice
{
    public static void main(String args[]){

        String str1 = "Java";
        System.out.println(str1);

        String str2 = new String("Java");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        String str3 = new String(c,1,3);
        System.out.println(str3);

        byte b[] = {65,66,67,68};
        String str4 = new String(b,2,2);
        System.out.println(str4);


        String x = "elephant";
        String y = "Elephant";
        String z = new String("Elephant");
        System.out.println(x == y);
        System.out.println(y == z);


        // Methods

        String abc = new String("   netbeans   ");
        System.out.println(abc.length());   // 8
        int len = abc.length();
        System.out.println(len);

        String abc2 = abc.toUpperCase();
        System.out.println(abc2);  //NETBEANS
        
        String abc3 = abc.trim();
        System.out.println(abc3);

        String abc4 = abc.substring(5,9);
        System.out.println(abc4);

        String abc5 = abc.replace('e','M');
        System.err.println(abc5);


        String actor = "Mr. Shahrukh Khan";
        Boolean actor1 = actor.startsWith("Mr.");
        System.out.println(actor1);

        Boolean actor2 = actor.startsWith("Shah", 4);
        System.out.println(actor2);

        Boolean actor3 = actor.endsWith("Khan");
        System.out.println(actor3);

        Character actor4 = actor.charAt(4);
        System.out.println(actor4);

        String website = "www.udemy.co.in";
        System.out.println(website);
        System.out.println(website.indexOf('.', 4));


        String lang1 = "Java";
        String lang2 = new String("Java");
        String lang3 = new String("python");
        System.out.println(lang1.equals(lang2)); // true
        System.out.println(lang1 == lang2); // false
        System.out.println(lang1.compareTo(lang2));  //0
        System.out.println(lang3.compareTo(lang2));

        System.out.println(str1.contains("Java"));




    }
}