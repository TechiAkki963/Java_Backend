class ArrayP_5{

    public static void main(String[] args) {

        int A[] = new int [10];

        A[0]=5; A[1]=9; A[2]=7; A[3]=8; A[4]=12; A[5]=7;

        int n = 6;   //number of elements in array 

        int x =20;
        int index = 2;

        for (int i = 0; i < n; i++ ){
            System.out.print(A[i]+", ");
        }
        System.out.println("");

        for(int i = n; i > index ;i--) //start from last 
        {
            A[i] = A[i - 1];
        }
            A[index] = x;


        for (int i = 0; i < n; i++ ){
            System.out.print(A[i]+", ");
        }
    }



}