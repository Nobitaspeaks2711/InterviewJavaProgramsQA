package StringPrograms;

public class SwapStringsUsingSubstring {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2  = "World";

        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());

        System.out.println(string1);
        System.out.println(string2);
    }
}
