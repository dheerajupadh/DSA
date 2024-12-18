import java.util.HashMap;
import java.util.Map;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int jumps = 0;
        int max = nums[0];
        int nextDestination = nums[0];
        Map<Character,Integer> charS = new HashMap<>();
        Map<Character,Integer> charP = new HashMap<>();


        for(int i=0;i< nums.length;i++){
            max = Math.max(max,nums[i]+i);
            if(nextDestination ==i){
                nextDestination = max;
                jumps++;
            }
        }

        System.out.println(jumps);
    }
}
