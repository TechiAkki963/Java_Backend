class ArrayP_3{

    public static void main(String[] args) {
        
        int A[] = {3, 6, 9, 12, 45, 18, 21, 24, 27, 30};


        int max = A[0];

        for(int i = 0; i < A.length; i++){

            if (A[i]> max){
                max = A[i];
            }

        }
        System.out.println("The Max value is "+ max);




    }


}