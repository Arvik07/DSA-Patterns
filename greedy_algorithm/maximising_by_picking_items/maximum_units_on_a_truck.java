class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int n = boxTypes.length;
        int ans=0;
        for(int type = 0; type<n; type++){
            if(boxTypes[type][0]<=truckSize){
                ans = ans + boxTypes[type][0]*boxTypes[type][1];
                truckSize=truckSize-boxTypes[type][0];
            }
            else{
                ans = ans + truckSize*boxTypes[type][1];
                truckSize=0;
            }
        }
        return ans;
    }
}