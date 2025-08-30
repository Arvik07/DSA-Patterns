class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;                     
        int right = maxInArray(piles);       
        int ans = right;                

        while (left <= right) {
            int mid = left + (right - left) / 2;   
            long hours = hoursNeeded(piles, mid);

            if (hours <= h) {
                ans = mid;         
                right = mid - 1;
            } else {
                left = mid + 1;    
            }
        }
        return ans;
    }

    private long hoursNeeded(int[] piles, int k) {
        long time = 0;
        for (int bananas : piles) {
            // ceiling division without using Math.ceil
            time += (bananas + k - 1) / k;
        }
        return time;
    }

    private int maxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
