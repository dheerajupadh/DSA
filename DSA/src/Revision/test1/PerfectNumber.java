package Revision.test1;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6;
        int sum =0;
        for(int i=1;i*i<num;i++){
            if(num%i == 0 && i*i == num){
                sum += i;
            }
            else if(num % i ==0){
                sum += i;
                sum += num/i;
            }
        }
        if(num == sum-num){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
