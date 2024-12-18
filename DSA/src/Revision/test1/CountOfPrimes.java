package Revision.test1;

public class CountOfPrimes {
    public static void main(String[] args) {

        int num = 19;
        int count =0;
        for(int i=2;i<=19;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isPrime(int n){

        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
