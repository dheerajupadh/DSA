package Revision.test1;

public class SubArrayWithLeastAvg {
    public static void main(String[] args) {
        int B = 3;
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int n = arr.length;
        float avg =0L;
        int index =0;
        float sum = 0L;
        for(int i=0;i<B;i++){
            sum += arr[i];
        }
        avg = sum/B;
        for(int i=B;i<arr.length;i++){
            sum = sum + arr[i] -arr[i-B];
            if(avg>sum/B){
                avg = sum/B;
                index = i;
            }
        }

        System.out.println(index-B+1);
    }
}
