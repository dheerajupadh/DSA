package Revision.test1;

public class GoodSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int B = 4;
        int sum =0;
        int n = arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            sum =0;
            for(int j=i;j<n;j++){
                sum += arr[j];

                if((i-j+1)%2 ==0 && sum < B){
                    count++;
                }
                if((i-j+1)%2 !=0 && sum > B){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
