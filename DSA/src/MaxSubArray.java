public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,-1};
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            maxSum = Math.max(maxSum,nums[i]);
            nums[i] = nums[i] + nums[i-1];
            maxSum = Math.max(maxSum,nums[i]);
        }


        for(int i=1;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                maxSum = Math.max(maxSum,nums[j]-nums[i]);
            }
        }
    }
}
