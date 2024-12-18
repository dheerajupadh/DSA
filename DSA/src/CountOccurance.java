public class CountOccurance {
    public static void main(String[] args) {
        String A = "bob";
        int count=0;
        for(int i=1;i<=A.length()-2;i++){
            int left = i-1;
            int right = i+1;
            if(A.charAt(left) == A.charAt(right) && A.charAt(left) == 'b' && A.charAt(i) == 'o')
                count++;
        }
        System.out.println(count);
    }
    }

