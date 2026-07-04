class Add_2D_Arrays{

    public static void main(String[] args) {
        
        int A[][] = {{1,2,3},{2,4,6},{3,5,7}};
        int B[][] = {{9,8,7},{3,6,9},{1,3,5}};
        int C[][];
        C = new int [3][3];
        for (int i=0; i < A.length; i++){

            for(int j=0; j < A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
            System.out.println("");
        }

        for (int x[]: C){
            for (int y: x){
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }

    }


}