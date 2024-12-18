public class AntiDiagnalsSquare {
    public static void main(String[] args) {

        int[][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int N = A.length;
        int[][] res = new int[2*N-1][N];
        int row =0;
        int col =0;
        int sum =0;
        while(sum<N+N-1){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(i + j == sum){
                        res[row][col] = A[i][j];
                        col++;
                    }
                }

            }
            sum++;
            row++;
            col =0;
        }
    }
}
