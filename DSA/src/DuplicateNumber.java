import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {
        Map<Integer,Integer> np = new HashMap<>();
        int[] nums = {12,3,4,5,6,3};
        for(int i=0;i<nums.length;i++){
            if(np.containsKey(nums[i])){
                System.out.println(nums[i]);
            }else{
                np.put(nums[i],1);
            }
        }
    }
}
