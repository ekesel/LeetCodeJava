```
class Solution {
public boolean canPartition(int[] nums) {
int sum = 0;
for(int i : nums) sum += i;
if(sum % 2 != 0) return false; // 2 equal partitions not possible for odd sum
return subsetSum(nums, 0, 0, sum/2);
}
private boolean subsetSum(int[] nums, int i, int sumSoFar, int target) {
if(sumSoFar == target) return true;
if(i == nums.length || sumSoFar > target) return false;
return subsetSum(nums, i + 1, sumSoFar + nums[i], target)
|| subsetSum(nums, i + 1, sumSoFar, target);
}
}
```