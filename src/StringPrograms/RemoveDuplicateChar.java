package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
    public static String removeDuplicates(String inputString) {
        String lowercaseString = inputString.toLowerCase();
        char[] characters = lowercaseString.toCharArray();
        LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();

        for (char character : characters) {
            if (!uniqueCharacters.contains(character)) {
                uniqueCharacters.add(character);
            }
        }

        StringBuilder resultBuilder = new StringBuilder();

        for (char character : uniqueCharacters) {
            resultBuilder.append(character);
        }

        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        String inputString = "hackerearth";
        String result = removeDuplicates(inputString);
        System.out.println(result);
    }
}
