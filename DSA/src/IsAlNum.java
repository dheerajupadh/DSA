public class IsAlNum {
    public static void main(String[] args) {
        char[] A = {'S','c','a','l','e','r','A','c','a','d','e','m','y','2','0','2','0','@'};
        for(int i=0;i<A.length;i++){
            if(!(A[i]>=48 && A[i] <= 57 || A[i]>=65 && A[i] <= 90 || A[i]>=97 && A[i] <= 122 ))
                System.out.println(0);
        }
        System.out.println(1);
    }
}
