public class MissingNumber {
    public static void main(String[] args) {
        int[] A = {3, 4, -1, 1};
        int n = A.length;
        for(int i=0;i<n;i++){
            if(A[i] < 1){
                A[i] = n+2;
            }
        }
        for(int i=0;i<n;i++){
            if(Math.abs(A[i]) <n){
                A[Math.abs(A[i]-1)] = -1 * A[Math.abs(A[i]-1)];
            }
        }
        for(int i=1;i<n;i++){
            if(! (A[i] <0)){
                System.out.print(i+1);
            }
        }
    }
}
