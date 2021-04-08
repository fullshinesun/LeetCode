package util;

public class MyStringUtil {
    public static String subString(String origin, int startAt) {
        char[] subchars = new char[origin.length() - startAt];
        for (int i = 0; startAt + i < origin.length(); i++) {
            subchars[i] = origin.charAt(startAt + i);
        }
        return String.valueOf(subchars);
    }

}
