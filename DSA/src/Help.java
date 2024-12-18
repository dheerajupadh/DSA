import java.util.Arrays;

public class Help {
    public static void main(String[] args) {

        int[] arr = {};
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        int i=1;
        int allocated_value = arr[arr.length-1] - arr[0];
        while(i<=arr.length){
            int right = arr[arr.length-1] - arr[i-1];
            int left = arr[i-1];
            if(right > left){
                allocated_value = Math.min(allocated_value,right);
            }else{
                allocated_value = Math.min(allocated_value,left);
            }
        }
//        return allocated_value;
    }
}
