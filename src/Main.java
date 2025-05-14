import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("false");
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        if (Arrays.equals(sCharArray, tCharArray)) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    // Other Solution
    public boolean isAnagram2(String s, String t) {
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
        isAnagram("racecar", "carrace");
        isAnagram("jar", "jam");
        isAnagram("rats", "star");
        isAnagram("bar", "bars");
    }
}