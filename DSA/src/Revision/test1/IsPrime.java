package Revision.test1;

public class IsPrime {
    public static void main(String[] args) {
        int num = 25;
        boolean flag = true;
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                System.out.println("Not Prime");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("prime");
        }
    }
}
