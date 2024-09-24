package ArrayPrograms;

import java.util.Arrays;

public class SecLarSecSmallArray {
    public  static void main(String[]args){
        //code to find second largest and second smallest numbers in array.
        int[]arrayList ={4,2,3,1,0,6,12,15,20};
        int num = arrayList.length;
        Arrays.sort(arrayList);
        System.out.println("second Largest number"+arrayList[num-2]);
        System.out.println("second Smallest number"+arrayList[1]);



    }
}
