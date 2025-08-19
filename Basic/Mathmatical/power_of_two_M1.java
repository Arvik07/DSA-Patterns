class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        double val = Math.log(n) / Math.log(2);
        return Math.abs(val - Math.round(val)) < 1e-10;
    }
}
