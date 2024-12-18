import java.util.*;

public class AllAnagrams {
    public static void main(String[] args) {
        String s = "ababababab";
        String p ="aab";
        Map<Character,Integer> charS = new HashMap<>();
        Map<Character,Integer> charP = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            if(!charP.containsKey(p.charAt(i))){
                charP.put(p.charAt(i),1);
            }else{
                charP.put(p.charAt(i),charP.get(p.charAt(i)) +1);
            }
            if(!charS.containsKey(s.charAt(i))){
                charS.put(s.charAt(i),1);
            }else{
                charS.put(s.charAt(i),charS.get(s.charAt(i)) +1);
            }
        }
        long count = 0L;
        for(int i=0,j=p.length();j<s.length();i++,j++){
            count = charP.entrySet().stream().filter(key -> key.getValue() == charS.getOrDefault(key.getKey(), 0)).count();
            if(count == charP.size()){
                result.add(i);
            }
            charS.put(s.charAt(i),charS.get(s.charAt(i))-1);
            if(!charS.containsKey(s.charAt(j))){
                charS.put(s.charAt(j),1);
            }else{
                charS.put(s.charAt(j),charS.get(s.charAt(j)) +1);
            }

        }
        count = charP.entrySet().stream().filter(key -> key.getValue() == charS.getOrDefault(key.getKey(), 0)).count();
        if(count == charP.size())
            result.add(s.length()-p.length());
        for(int a:result){
            System.out.println(a);
        }
    }
}
