public class AddOneArray {
    public static void main(String[] args) {
        int[] A = {9,9};
        int count =0;
        for(int i=0;i<A.length;i++){
            if(A[i] == 0) {
                count++;
            }else{
                break;
            }
        }
        if(count >0 && count!=A.length){
            int[] B = new int[A.length-count];
            for(int i=A.length-1;i>A.length-count;i++){
                B[i] = A[i];
            }
            A =B;
        }
        A = cal(A);
        for(int a :A)
        System.out.print(a);

    }
    public static int[] cal(int[] A){
        for(int i=A.length-1;i>=0;i--){
            if(A[i]!=9){
                A[i] = A[i] +1;
                return A;
            }else{
                A[i] = 0;
            }
        }
        if(A[0] == 0){
            int[] B = new int[A.length+1];
            for(int i=0;i<A.length;i++){
                B[i+1] = A[i];
            }
            B[0] = 1;
            A=B;
            return A;
        }
        return A;
    }
}
