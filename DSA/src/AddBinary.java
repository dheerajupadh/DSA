public class AddBinary {
    public static void main(String[] args) {
        String str = addBinary("1000","0101");
        System.out.println(str);
    }
    public static String addBinary(String A, String B) {
        int n  = A.length();
        int m = B.length();
        String ans = "";
        int carry = 0;
        char quotient  = '0';
        while(n>0 || m > 0||carry>0){
            int sum =0;
            if(n>0 && m>0){
                sum = (A.charAt(n-1) - '0' + B.charAt(m-1) - '0') + carry;
            }
            if(n>0 && m<=0){
                sum = (A.charAt(n-1) - '0') + carry;
            }
            if(m>0 && n<=0){
                sum = (B.charAt(m-1) - '0') + carry;
            }
            if(n <= 0 && m <= 0 && carry > 0){
                sum = carry;
            }

            ans = sum % 2 +ans;
            carry = sum/2;
            n--;
            m--;
        }
        return ans;
    }
}
