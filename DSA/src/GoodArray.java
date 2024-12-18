import java.util.Arrays;
import java.util.List;

public class GoodArray {

    public static void main(String[] args) {
        //{3,12,11},{3,12,11,11,11},{12,11,11},{12,11,11,11,5},{11,11,11},{11,11,5},
        List<Integer> A = Arrays.asList(3,12,11,11,11,15);
        int B = 12;
        int count =0;
        int totalCount =0;
        int sum =0;
        for(int i=0;i<A.size();i++){
            for(int j=i;j<A.size();j++){
                sum = sum + A.get(j);
                if(sum < B && (j - i + 1) % 2 == 0){
                    count++;
                }else if(sum > B && (j - i + 1)  % 2 !=0){
                    count++;
                }
            }
            sum =0;
        }
        System.out.println(count);
    }
}
