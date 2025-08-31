class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int m = intervals.length;
        int count =0;
        int n = intervals[0].length;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int end = intervals[0][1];
        for(int row = 1 ; row<m;row++){
            if(end>intervals[row][0]){
                count++;
            }
            else{
                end=intervals[row][1];
            }
        }
        return count;
    }
}