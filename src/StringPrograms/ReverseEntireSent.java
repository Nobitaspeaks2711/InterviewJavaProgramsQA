package StringPrograms;

public class ReverseEntireSent {
    public static void main(String[] args) {
        String str = "india is country";
        String[] words = str.split(" ");
        String ans = "";

        for (int i = words.length - 1; i >= 0; i--) {
            ans += words[i] + " ";
        }
        System.out.println(ans.trim());
    }
}
