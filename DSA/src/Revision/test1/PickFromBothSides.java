package Revision.test1;

public class PickFromBothSides {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,5,3,6,8,9,7,2,8};
        int sum =arr[0];
        int B  = 3;
        for(int i=1;i<B;i++){
            sum = sum + arr[i];
        }
        int temp =sum;
        int j =B-1;
        for(int i=arr.length-1;i>arr.length-B-1;i--){
             temp = temp + arr[i] - arr[j];
            sum = Math.max(sum, temp);
            j--;
        }
        System.out.println(sum);
    }
}
