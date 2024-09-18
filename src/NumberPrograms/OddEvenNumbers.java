package NumberPrograms;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num%2==0)//Brute forcew Approach
        {
            System.out.println("Given number is even number");
        }
        else{
            System.out.println("Given number is odd number");
        }
    }
}
