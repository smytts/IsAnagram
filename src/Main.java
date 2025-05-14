import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if (Arrays.equals(sCharArray, tCharArray)) {
            return true;
        }

        return false;
    }

    // Other Solution
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("racecar", "carrace"));
        System.out.println(isAnagram("jar", "jam"));
        System.out.println(isAnagram("rats", "star"));
        System.out.println(isAnagram("bar", "bars"));

        System.out.println(isAnagram2("racecar", "carrace"));
        System.out.println(isAnagram2("jar", "jam"));
        System.out.println(isAnagram2("rats", "star"));
        System.out.println(isAnagram2("bar", "bars"));
    }
}