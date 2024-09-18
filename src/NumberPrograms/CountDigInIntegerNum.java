package NumberPrograms;

public class CountDigInIntegerNum {
    public static void main(String[]args){
        long num = 245678765;
        int count=0,num2= 245678;

        //1.by using while loop
        while(num!=0){
            num =num/10;
            count++;

        }
        System.out.println(count);
    }
}
