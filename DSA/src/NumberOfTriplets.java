public class NumberOfTriplets {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3};
        int triplets = 0;
        for(int i=1;i<A.length-1;i++){
            int left = i-1;
            int right = i+1;
            int rightCOunt = 0;
            int leftCount = 0;
            while(left>=0){
                if(A[left] < A[i]){
                    leftCount++;
                }
                left--;
            }
            while (right <A.length){
                if(A[right] > A[i]){
                    rightCOunt++;
                }
                right++;
            }
            triplets += leftCount*rightCOunt;
        }
        System.out.println(triplets);
    }
}
