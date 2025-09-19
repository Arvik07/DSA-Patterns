class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store: sorted word -> list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        // Process each word
        for (String word : strs) {
            // Convert word to char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // Use sorted word as the key
            String key = new String(chars);

            // If the key is not in the map yet, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the word into the correct group
            map.get(key).add(word);
        }

        // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
