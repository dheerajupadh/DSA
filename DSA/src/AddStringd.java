public class AddStringd {
    public static void main(String[] args) {
        String A ="110";
        String B ="10";

        int n = A.length();
        int m = B.length();
        int carry =0;
        String ans ="";
        while(n>=0 || m>=0||carry>0){
            int sum =0;
            if(n >0 && m>0){
                sum = A.charAt(n-1) - '0' + B.charAt(m-1) -'0' + carry;
            }
            if(n>0 && m<=0){
                sum = A.charAt(n-1) - '0' +carry;
            }
            if(m>0 && n<=0){
                sum = B.charAt(m-1) -'0' + carry;
            }if(n<=0 && m<=0 && carry>0){
                sum = carry;
            }
            ans = sum%2 +ans;
            carry = sum/2;
            n--;
            m--;
        }
    System.out.println(ans);
    }
}
