import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0  || strs == null) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> freqStringMap = new HashMap<>();

        for (String s: strs) {
            
            String freqString = getFrequencyString(s);

            if (freqStringMap.containsKey(freqString)) {
                freqStringMap.get(freqString).add(s);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(s);
                freqStringMap.put(freqString, strList);
            }
        }

        return new ArrayList<>(freqStringMap.values());
        
    }

    private String getFrequencyString(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder freqString = new StringBuilder("");
        char c = 'a';

        for (int i : freq) {
            freqString.append(c);
            freqString.append(i);
            c++;
        }

        return freqString.toString();

    }

     
}