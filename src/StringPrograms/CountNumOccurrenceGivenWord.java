package StringPrograms;

public class CountNumOccurrenceGivenWord {
    public static void main(String[] arg) {
        String str = "Java is programming language. Java is mostly used programming language.";
        String[] words = str.toLowerCase().split("\\s+");
        String word = "java";
        int ocr = 0;

        for (String w : words) {
            if (w.equals(word)) {
                ocr++;
            }
        }
        System.out.println("The word 'Java' occurs " + ocr + " times.");
    }
}
