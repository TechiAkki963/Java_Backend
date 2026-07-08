class VariableArgument{

    static void show(int ...A){
        for(int x: A){
            System.out.println(x);
        }
    }

    static void showList(int start, String ...S){
        for(int i = 0; i < S.length; i++)
        {
            System.out.println(start+". "+S[i]);
            start ++;
        }
    }

    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[] {3,5,7,9,11,13,15});  //it has anoynomous array


        showList(5,"John Wick","Ultimate Spiderman","Interstellar","G.I.joe");



    }

    // Array reference A [] and ...A are not the same
    // if we pass (int A[]) as argument only show(new int[] {3,5,7,9,11,13,15}); will work 

}