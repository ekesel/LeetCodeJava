class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int start = 0;
        int end = 0;
        int sum = max;
        for(int i=1;i<nums.length;i++){
            if(sum >=0 && nums[i]>0){
                end++;
                sum+=nums[i];
            }
            else if(sum<0 && nums[i]>=0){
                start =i;
                end=i;
                sum=nums[i];
            }
            else if(sum <0 && nums[i]<0){
                sum=nums[i];
            }
            else if(sum > nums[i]) {
	            		sum +=nums[i];
	            	}
            if(sum> max){
                max = sum;
                end = i;
            }
        }
        return max;
    }
}