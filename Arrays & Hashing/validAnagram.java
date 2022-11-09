import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int n : counter) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}