package NumberPrograms;

public class LargestNumberBtw3 {
    public static void main (String[]args){

        //1.By using if else conditions
        int num1 =7,num2=9,num3=10;
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+"is the greatest number");
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println(num2+"is the greatest number");
        }
        else{
            System.out.println(num3+"is the greatest number");
        }
    }
}
