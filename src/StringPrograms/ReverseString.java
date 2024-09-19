package StringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "mama";
        String st2 = "";

        // 1. Using the charAt() method to reverse the string.
        for (int i = str.length() - 1; i >= 0; i--) {
            st2 = st2 + str.charAt(i); // Extract each character and store in string.
        }

        // Display the reversed string
        System.out.println("Reversed string: " + st2);

        // Check if the original string is a palindrome
        if (str.equals(st2)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        //2. Using built in reverse() method of the stringBuilder class.
        String input = "welcome to java programming.";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);  //append a string into StringBuilder input1.
        input1.reverse();
        System.out.println(input1);

        //3.`Using String buffer
        String strText = "Java Learning";
        //conversion from String object to String Buffer.
        StringBuffer sbr = new StringBuffer(strText);
        sbr.reverse();
        System.out.println(sbr);

    }
}
