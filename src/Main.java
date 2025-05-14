import java.util.Arrays;

public class Main {
    public static void isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if (Arrays.equals(sCharArray, tCharArray)) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }

    // Other Solution
    public static void isAnagram2(String s, String t) {
        if (s.length() != t.length()) return;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return;

    }

    public static void main(String[] args) {
        isAnagram("racecar", "carrace");
        isAnagram("jar", "jam");
        isAnagram("rats", "star");
        isAnagram("bar", "bars");

        isAnagram2("racecar", "carrace");
        isAnagram2("jar", "jam");
        isAnagram2("rats", "star");
        isAnagram2("bar", "bars");
    }
}