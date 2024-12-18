public class AllSubArrays {
    public static void main(String[] args) {
        int[] A = {36,63,63,26,87,28,77,93,7};
        int[][] ret = new int[A.length][A.length];

        int inc =0;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                for(int k=i;k<=j;k++){
                    int[] res = new int[j-i+1];
                    System.out.print(A[k] +" ");
                    res[inc] = A[k];
                    inc++;
                }
            System.out.println();
                inc =0;
//                ret[i] = res;

            }
            System.out.println();
        }
    }
}
