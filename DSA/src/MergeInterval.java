import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {


        int[][] arr = {{1, 3}, {2, 6}, {8, 10},{9,13}, {15, 18}};


        int start = arr[0][0];
        int end = arr[0][1];
        List<List<Integer>> A = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if(end >arr[i][0]){
                start = Math.min(start,arr[i][0]);
                end = Math.max(end,arr[i][1]);
            }else{
                A.add(Arrays.asList(start,end));
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        A.add(Arrays.asList(start,end));
        for(int i=0;i<A.size();i++) {
            System.out.println(A.get(i).get(0) +" " +A.get(i).get(1));
        }
    }
}
