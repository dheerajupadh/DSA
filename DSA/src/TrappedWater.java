public class TrappedWater {
    public static void main(String[] args) {
        int[] arr ={5, 4, 1, 4, 3, 2, 7};
        int[] leftMax =new int[arr.length];
        int[] rightMax = new int[arr.length];
        int maximum = arr[0];
        for(int i=1;i<leftMax.length-1;i++){
            maximum = Math.max(maximum,arr[i-1]);
            leftMax[i] = maximum;
        }
        maximum = arr[arr.length-1];
        for(int i=rightMax.length-2;i>=0;i--){
            maximum = Math.max(maximum,arr[i+1]);
            rightMax[i] = maximum;
        }
        int[] res = new int[arr.length];
        for(int i=1;i<=arr.length-2;i++){
            res[i] = Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        int water = 0;
        for(int a:res){
            water += a;
            System.out.println(water);
        }
    }
}
