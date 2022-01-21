class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=0;
 int i=0;
 Map<Integer,Integer> s = new HashMap<Integer,Integer>();
    for(i=0;i<nums.length;i++){
       x = target - nums[i];
       if(s.containsKey(x)){
        break;        
       }
        else{
          s.put(nums[i],i);
        }
        
    } 
    int b = s.get(x);
    return new int[] {b,i};  
    }
}