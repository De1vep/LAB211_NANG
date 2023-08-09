package count;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Counter {

    private final Map<Character, Integer> charCount = new HashMap<>();
    private final Map<String, Integer> letterCount = new HashMap<>();

    public Counter() {
    }

    public void countCharacterAndLetter(String text) {
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                continue;
            }
            if (!charCount.containsKey(ch)) {
                charCount.put(ch, 1);
            } else {
                charCount.put(ch, (int) (charCount.get(ch) + 1));
            }
        }

        StringTokenizer token = new StringTokenizer(text);
        while (token.hasMoreTokens()) {
            String word = token.nextToken();
            if (!letterCount.containsKey(word)) {
                letterCount.put(word, 1);
            } else {
                letterCount.put(word, (int) (letterCount.get(word) + 1));
            }
        }
    }

    public void display() {
        System.out.println(letterCount);
        System.out.println(charCount);
    }
}
