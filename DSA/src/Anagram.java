public class Anagram {
    public static void main(String[] args) {
        int a = solve("bgipsvukg","ylwfyulte");
        System.out.println(a);
    }
    public static int solve(String A, String B) {
        int[] countA = new int[26];
        int[] countB = new int[26];
        if(A.length() !=B.length()){
            return 0;
        }
        for(int i=0;i<A.length();i++){
            countA[A.charAt(i) - 'a'] = countA[A.charAt(i) - 'a'] +1;
            countB[B.charAt(i) - 'a'] = countB[B.charAt(i) - 'a'] +1;

        }
        for(int i=0;i<26;i++){
            if(countA[i] !=countB[i])
                return 0;
        }
        return 1;
    }

}
