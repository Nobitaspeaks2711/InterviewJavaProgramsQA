package NumberPrograms;

public class Asc_letters {
    public static void main(String[] args) {
        String str = "vaibhav";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println(); // Move to the next line after each substring
        }
    }
}


