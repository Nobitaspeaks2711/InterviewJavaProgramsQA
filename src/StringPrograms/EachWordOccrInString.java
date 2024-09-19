package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class EachWordOccrInString {
    public static void main(String[] args) {
        String str = "Alica is girl and Bob is a boy.";
        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);
    }
}
