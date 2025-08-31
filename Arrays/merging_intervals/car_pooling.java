class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int changes[] = new int[1001];
        for(int[] trip : trips){
            int passangers=trip[0];
            int start = trip[1];
            int end = trip[2];
            changes[start] = changes[start] + passangers ;
            changes[end] = changes[end] - passangers; 
        }
        int current=0;
        for(int i=0 ;i<1001;i++){
            current = current + changes[i];
            if(current>capacity){
                return false;
            }
        }
        return true;
    }
}