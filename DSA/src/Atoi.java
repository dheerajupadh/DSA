public class Atoi {
    public static void main(String[] args) {
        System.out.print(rec("+042",3));
    }
    public static String rec(String s,int l){
        if ( s.charAt(l) == '-' || s.charAt(l) == '+' || s.charAt(l) == ' ') {

            return "";
        }
        return String.valueOf(rec(s,l-1) + s.charAt(l));
    }
}
