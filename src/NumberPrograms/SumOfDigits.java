package NumberPrograms;

public class SumOfDigits {
    public static void main(String[]args){
        //sum of all given numbers
        int n = 987;
        int sum = 0;
        while (n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
