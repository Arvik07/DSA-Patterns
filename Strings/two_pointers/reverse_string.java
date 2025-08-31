class Solution {
    public void reverseString(char[] s) {
        char sn[] = new char[s.length];
        for(int i =0;i<s.length;i++){
            sn[i]=s[i];
        }
        for(int j = 0 ; j<s.length ;j++){
            s[j]=sn[s.length-j-1];
        }
    }
}