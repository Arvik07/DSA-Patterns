class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch)+1);
            }
            else{
                hm.put(ch , 1);
            }
        }
        for(int j = 0;j<ransomNote.length();j++){
            char ch1 = ransomNote.charAt(j);
            if(hm.get(ch1)!=null && hm.get(ch1)>=1){
                hm.put(ch1 , hm.get(ch1)-1);
            }
            else{
                return false;
            }
        }
        return true;

    }
}