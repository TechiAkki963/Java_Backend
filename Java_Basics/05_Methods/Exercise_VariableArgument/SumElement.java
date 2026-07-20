class SumElement{
    static int sum(int ...A){
        int sum = 0;

        for (int i = 0; i < A.length; i++){
            sum = sum + A[i];
            
        }
        return sum;
    }


    public static void main(String[] args) {
        int a = sum(1,2,3);
        System.out.println(a);

        int b =sum();
        System.out.println(b);

        int c = sum(10);
        System.out.println(c);

        int d = sum(new int[] {2,3,6});
        System.out.println(d);
    }
}