public class PrimeNumber {
    public static void main (String[]args){
        //Prime number is a number that is greater than 1 and  divided by one or itself only.
        int num =31;
        int count =0;
        if(num <= 1){
            System.out.println("The number is not prime");
            return;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                count++;
        }
        if(count>1){
            System.out.println("The Number is not prime");
        }
        else{
            System.out.println("The Number is prime");
        }
    }
}
