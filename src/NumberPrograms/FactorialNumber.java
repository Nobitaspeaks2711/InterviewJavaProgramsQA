package NumberPrograms;

import java.util.Scanner;

public class FactorialNumber {
    public static void main (String[]args){
        //Factorial number in java:Factorial of n is the  product of all positive descending integers.
        //5!= 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which  you want for factorial");
        int num=sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++){
            fact =fact*i;
        }
        System.out.println("Factorial of" +num+ "is" +fact);
    }
}
