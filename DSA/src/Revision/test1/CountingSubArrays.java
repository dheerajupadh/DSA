package Revision.test1;

public class CountingSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 11, 2, 3, 15};
        int B =  3;
        int sum =0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum < B){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
