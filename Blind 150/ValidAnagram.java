import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> count_s = new HashMap<>();
        HashMap<Character, Integer> count_t = new HashMap<>();


        for (char c : s.toCharArray()) {
            if (!count_s.containsKey(c)) {
                count_s.put(c, 1);
            } else {
                int curr_count = count_s.get(c);
                count_s.put(c, curr_count + 1);
            }
        }

        for (char c: t.toCharArray()) {
            if (!count_t.containsKey(c)) {
                count_t.put(c, 1);
            } else {
                int curr_count = count_t.get(c);
                count_t.put(c, curr_count + 1);
            }
        }

        return count_s.equals(count_t);
        
    }
}