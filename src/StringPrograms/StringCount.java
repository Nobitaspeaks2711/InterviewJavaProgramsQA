package StringPrograms;

public class StringCount {
    public static void main(String[] args) {

        String a = "This is a string";
        int count = 0;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
