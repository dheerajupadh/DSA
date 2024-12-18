import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddInterval {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[] interval = {9,13};
        List<List<Integer>> res = new ArrayList<>();
        int i=0;
        while(i<arr.length && arr[i][1] < interval[0]){
            res.add(Arrays.asList(arr[i][0],arr[i][1]));
            i++;
        }
        List<Integer> temp = Arrays.asList(interval[0],interval[1]);
        while(i<arr.length &&arr[i][0] < interval[1]){
            temp.set(0,Math.min(arr[i][0],temp.getFirst()));
            temp.set(1,Math.max(arr[i][1],temp.get(1)));
            i++;
        }
        res.add(temp);
        while (i<arr.length){
            res.add(Arrays.asList(arr[i][0],arr[i][1]));
            i++;
        }
        for(int k=0;k< res.size();k++){
            System.out.println(res.get(k).get(0) + " " +res.get(k).get(1));
        }
    }
}
