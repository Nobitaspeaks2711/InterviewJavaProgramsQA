package NumberPrograms;

public class ArmstrongNumbers {
    //Armstrong number is a number that is equal to the sum of cubes of its digits.
    //153 is an armstrong numbers. (1*1*1)+(5*5*5)+(3*3*3)=153
    public static void  main (String[]args){
        int sum=0,res,temp;
        int num =153;
        temp =num;
        while (num>0){
            res =num%10;
            num=num/10;
            sum =sum+(res*res*res);
        }
        if(temp==sum)
            System.out.println(temp + "is an armstrong number");
        else
            System.out.println(temp + "is not an armstrong number");
    }
}
