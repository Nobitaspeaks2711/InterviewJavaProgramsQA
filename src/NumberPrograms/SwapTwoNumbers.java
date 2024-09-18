package NumberPrograms;

public class SwapTwoNumbers {

    //1.Swap two numbers
    public static void main (String []args){
        int a= 100;
        int b = 200;
        System.out.println("After swapping, a="+a+"and b="+b);
        //1. Swapping using 3 variables
//        int temp =a;
//        a=b;
//        b= temp;
//        System.out.println("After swapping, a="+a+"and b="+b);
        //2.using 3 variables

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping, a="+a+"and b="+b);
    }
}
