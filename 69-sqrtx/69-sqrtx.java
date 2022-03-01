class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long lo = 0, hi = x/2, mid = 0;
        while (lo <= hi) {
            mid = lo + (hi-lo)/2;
            if (mid*mid == x) return (int)mid;
            else if (mid*mid > x) hi = mid-1;
            else lo = mid + 1;
        }
        return (mid * mid > x) ? (int)mid-1 : (int)mid;
    }
}