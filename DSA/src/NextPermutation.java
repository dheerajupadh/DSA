public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {5,1,1};
        int i = nums.length-2;
        while(i>=0 && (nums[i] >=nums[i+1])){
            i--;
        }
        System.out.println(i);
        for(int j=nums.length-1;j>i && i>=0;j--){
            if(nums[i] < nums[j] ){
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
                break;
            }
        }
        int start = i+1;
        int end = nums.length-1;
        while(end > start){
            int tem = nums[start];
            nums[start] = nums[end];
            nums[end] = tem;
            start++;
            end--;
        }
        for(int a:nums)
            System.out.print(a);
    }
}
