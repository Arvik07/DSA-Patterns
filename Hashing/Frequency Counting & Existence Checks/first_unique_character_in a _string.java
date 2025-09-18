class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> llm = new LinkedHashMap<>();
        char ans;
        for (char ch : s.toCharArray()) {
            llm.put(ch, llm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (llm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }
}