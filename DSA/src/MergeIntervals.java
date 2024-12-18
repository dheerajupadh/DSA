import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();
        A.add(Arrays.asList(1,3));
        A.add(Arrays.asList(6,9));

        List<Integer> B = Arrays.asList(2,5);
        List<List<Integer>> res = new ArrayList<>();
        int index =0 ;
        while(index < A.size() && B.get(0) > A.get(index).get(1)){
            res.add(A.get(index));
            index++;
        }
        while(index < A.size() && B.get((1)) < A.get(index).get(0)){
            B.set(0,Math.min(B.get(0) , A.get(index).get(0)));
            B.set(1,Math.max(A.get(index).get(1) , B.get(1)));
            index++;
        }
        res.add(B);
        while(index < A.size()){
            res.add(A.get(index));
            index++;
        }

        for(List<Integer> a:res){
            for(int num:a){
                System.out.print(num  + ",");
            }

        }


    }
}
