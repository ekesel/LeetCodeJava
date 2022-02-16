class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        Arrays.fill(res,1);
        int left = 1;
        int right = 1;
        int j = 0;
        for(int i=0;i<nums.length;i++)
        {
            j = nums.length-i-1;
            res[i] = left * res[i];
            res[j] = right * res[j];
            left = left *nums[i];
            right *= nums[j];
        }
        return res;
    }
}