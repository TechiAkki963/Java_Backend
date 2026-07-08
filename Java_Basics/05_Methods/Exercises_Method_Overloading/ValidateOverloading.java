class ValidateOverloading{


    static boolean validate(String name){
        //there is no number alphanumberic
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age){
        return age >=3 && age <=15;
    }
    public static void main(String[] args) {
        System.out.println(validate("teslla"));
    }



}