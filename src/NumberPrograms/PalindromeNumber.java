package NumberPrograms;

public class PalindromeNumber {
    //12321 is the palindrome number.
    public static void main (String[]args){
        int num =12321;
    //Reverse a number Using the While loop  reversed number
    int rev=0;
    int temp =num;
    int rem;
    while(num>0){
        rem=num%10;
        rev=(rev*10)+rem;
        num= num/10;
    }
    System.out.println("Reversed number is "+rev);
    if(rev==temp){
        System.out.println("Palindrome number");
    }
    else {
        System.out.println("Not Palindrome number");
    }
    }

}
