package problem.challenge.april2021;

public class VerifyingAnAlienDictionary {
    private static int[] alphabets = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        setAlphabets(order);
        for (int i = 0; i < words.length - 1; i++) {
            if (!isPreviousWord(words[i], words[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private void setAlphabets(String order) {
        for (int i = 0; i < 26; i++) {
            char alphabet = order.charAt(i);
            alphabets[alphabet - 'a'] = i;
        }
    }

    private boolean isPreviousWord(String prev, String next) {
        int length = Math.min(prev.length(), next.length());
        for (int i = 0; i < length; i++) {
            if (alphabets[prev.charAt(i) - 'a'] < alphabets[next.charAt(i) - 'a']) {
                return true;
            } else if (alphabets[prev.charAt(i) - 'a'] > alphabets[next.charAt(i) - 'a']) {
                return false;
            }
        }
        return prev.length() <= next.length();
    }
}
