class Array{
 public static void main(String[] args) {
     

    int A[] = new int [5];
    System.out.println(A.length); //5

    int B[] = {1,2,3,4,5};
    // System.out.println(B.length);

    B[2] = 15;

    for (int i = 0; i < B.length; i++){
        System.out.println(B[i]++);

    }
    for (int x: B){
        System.out.println(x);
    }
 }   

}