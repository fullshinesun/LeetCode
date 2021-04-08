package problem.challenge.april2021;

public class DetermineIfStringHalvesAreAlike {
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        char[] a = new char[half];
        char[] b = new char[half];
        for (int i = 0; i < half; i++) {
            a[i] = s.charAt(i);
            b[i] = s.charAt(half + i);
        }
        return countVowels(String.valueOf(a)) == countVowels(String.valueOf(b));
    }

    public int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char vowel : vowels) {
                if (s.charAt(i) == vowel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
