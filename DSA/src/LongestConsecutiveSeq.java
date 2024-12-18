import java.util.Arrays;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(nums);
        int count =0;
        int max = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == (nums[i-1]+1)){
                count ++;
            }else{
                if(count>max){
                    max= count;
                }
                count =0;
            }
        }
        System.out.println(max);
    }
}
