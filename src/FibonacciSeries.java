public class FibonacciSeries {
   // In fibonacci series , the next number is sum of previous two number
    public static void main(String[]args){
        int num1=0,num2=1,num =10;
        for(int i=0;i<=num;i++){
            System.out.print(num1+" ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
        }
    }
}
