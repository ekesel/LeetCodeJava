class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp =1 ;
        
        for(int i = 0;i<nums.length;i++){
            temp = temp*nums[i];
            max = Math.max(temp,max);
            if(nums[i]==0){
                temp = 1;
            }
        }
        temp = 1;
        for(int i = nums.length-1;i>=0;i--){
            temp = temp*nums[i];
            max = Math.max(temp,max);
            if(nums[i]==0){
                temp = 1;
            }
        }
        return max;
    }
}