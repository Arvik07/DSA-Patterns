class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int masks[]=new int[n];
        int lens[]=new int[n];
        for(int i = 0;i<n;i++){
            int mask = 0;
            for(char c : words[i].toCharArray()){
                mask = mask | (1<<(c - 'a'));
            }
            masks[i]=mask;
            lens[i]=words[i].length();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) { // no common letters
                    max = Math.max(max, lens[i] * lens[j]);
                }
            }
        }
        return max;
    }
}