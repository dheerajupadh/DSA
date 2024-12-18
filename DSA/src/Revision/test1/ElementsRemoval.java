package Revision.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementsRemoval {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(0,8,10);
        Collections.sort(A);
        int i=1;
        int sum = 0;
        for(int a =0;a<A.size();a++){
            sum += A.get(a) * (A.size()-a);
        }
        System.out.println(sum);
    }
}
