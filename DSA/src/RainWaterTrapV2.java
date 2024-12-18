public class RainWaterTrapV2 {
    public static void main(String[] args) {
        int[] arr ={5, 4, 1, 4, 3, 2, 7};
        int max =arr[0];
        int maxPos = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                maxPos = i;
            }
        }
        int water =0;
        int leftMax = arr[0];
        for(int i=1;i<maxPos;i++){
            if(arr[i-1] > leftMax){
                leftMax = arr[i-1];
            }
            int indi = leftMax-arr[i];
            if(indi > 0){
                water += indi;
            }
        }
        int rightMax = arr[arr.length-1];

        for(int i = arr.length-2;i>maxPos;i--){
            if(arr[i+1] > rightMax){
                rightMax = arr[i+1];
            }
            int indi = rightMax - arr[i];
            if(indi >0){
                water += indi;
            }
        }
        System.out.println(water);
    }
}
