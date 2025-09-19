class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] used = new boolean[strs.length]; // track used words

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue; // skip if already grouped
            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    curr.add(strs[j]);
                    used[j] = true;
                }
            }
            ans.add(curr);
        }
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : t.toCharArray()) {
            if (!hm.containsKey(ch)) {
                return false;
            }
            hm.put(ch, hm.get(ch) - 1);
            if (hm.get(ch) == 0) {
                hm.remove(ch);
            }
        }
        
        return hm.isEmpty();
    }
}