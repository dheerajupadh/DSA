import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColourfulNumber {
    public static void main(String[] args) {
        System.out.println(colorful(23));
    }
    public static int colorful(int A) {
        List<Integer> num = new ArrayList<>();

        int temp = A;
        int i=0;
        while(temp >0){
            num.add(temp%10);
            temp /= 10;
            i++;
        }
        Map<Integer,Integer> res = new HashMap<>();
        for(i=0;i<num.size();i++){
            int product = 1;
            for(int j=i;j<num.size();j++){
                product *= num.get(j);
                if(res.containsKey(product)){
                    return 0;
                }
                res.put(product,1);
            }
        }
        return 1;
    }
}
