import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWIthK {
    public static void main(String[] args) {
        Map<Character,Integer> mp = new HashMap<>();
        String s= "aaabb";
        int k =3;

        for(int i=0;i<k;i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }
            else{
                int temp = mp.get(s.charAt(i)) + 1;
                mp.put(s.charAt(i),temp);
            }
        }
        int count = mp.get(s.charAt(0))==3?1:0;
        for(int i=0,j=k;j<s.length();j++,i++){

            long isKString = mp.entrySet().stream().filter(m -> m.getValue()>=3).count();

        }
    }
}
