package StringPrograms;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[]args){
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        input = input.replaceAll("\\s", "");
        System.out.println(input);
    }
}
