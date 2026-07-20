class MaxNumber{

    static int maxNumber(int ...A){
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        int m = A[0];
        for(int i =0; i<A.length; i++){
            if (m < A[i]){
                m = A[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        
      int a = maxNumber(1,19,5,8,21,20);
      System.out.println(a);

      int b = maxNumber();
      System.out.println(b);

      int c = maxNumber(10);
      System.out.println(c);
    }

}