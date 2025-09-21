class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        // build frequency map for p
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (pMap.containsKey(c)) {
                pMap.put(c, pMap.get(c) + 1);
            } else {
                pMap.put(c, 1);
            }
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        int window = p.length();

        // first window
        for (int i = 0; i < window; i++) {
            char c = s.charAt(i);
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        if (sMap.equals(pMap)) {
            ans.add(0);
        }

        // slide the window
        for (int i = window; i < s.length(); i++) {
            char addChar = s.charAt(i);
            char removeChar = s.charAt(i - window);

            // add new char
            if (sMap.containsKey(addChar)) {
                sMap.put(addChar, sMap.get(addChar) + 1);
            } else {
                sMap.put(addChar, 1);
            }

            // remove old char
            sMap.put(removeChar, sMap.get(removeChar) - 1);
            if (sMap.get(removeChar) == 0) {
                sMap.remove(removeChar);
            }

            if (sMap.equals(pMap)) {
                ans.add(i - window + 1);
            }
        }

        return ans;
    }
}
