import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBySumOfDigits {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return somOgDigits(o1) - somOgDigits(o2);
            }
        });
    }

        public static int somOgDigits(int n){
            int sum =0;
            while(n >0){
                sum += n%10;
                n /= 10;
            }
            return sum;
        }
}
