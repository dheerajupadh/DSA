public class Demo {

    public static void main(String[] args) {
        String s1 = new String("Br");
        String s2 = new String("Br");
        System.out.print(s1 == s2 +" ");
        System.out.print( s1.equals(s2));
        System.out.println();
        StringBuilder sb1 = new StringBuilder("br");
        StringBuilder sb2 = new StringBuilder("br");
        System.out.print(sb1.equals(sb2) + " ");
        System.out.print(sb1 == sb2);
    }
}
