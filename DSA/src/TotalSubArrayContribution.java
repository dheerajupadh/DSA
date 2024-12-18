public class TotalSubArrayContribution {
    public static void main(String[] args) {
        int[] A ={2,9,5};
        long sum =0;
        long contribution = 0;
        for(int i=0;i<A.length;i++){
            contribution = A[i] * (i+1)*(A.length-i);
            sum += contribution;
        }
        System.out.println(sum);
    }
}
