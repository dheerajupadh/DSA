import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSwaps {
    public static void main(String[] args) {
        int a = solve(Arrays.asList(31,98,58,86,36,31,3,22,4,17,51,33,56,7,91,17,59,66,54,67,55,41,58,24,100,1,98,68,21,33,27,67,20,66,20,100,36,89,20,15,13,26,11,29,99,36,39,49,74,77,54,66,30,21,14,18,83,72,10,22,53,83,60,9,68,56,9,21,77,44,45,61,97,82,35,16
                ,38,95,55,11,46,77,25,3,44,18),8);
    }
    public static  int solve(List<Integer> A, int B) {

        int count = 0;
        for(int a:A){
            if(a< B){
                count++;
            }
        }

        int minSwaps = 0;
        for(int i=0;i<count;i++){
            if(A.get(i) > B){
                minSwaps++;
            }
        }
        int result = minSwaps;
        for(int i=count;i<A.size()-B;i++){
            if(A.get(i-count) < B){
                minSwaps++;
            }
            if(A.get(i) < B){
                minSwaps--;
            }
            result = Math.min(result,minSwaps);
        }
        return result;
    }
}
