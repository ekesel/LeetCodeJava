class Solution {
    static List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for(int i: nums)
        {
            num.add(i);     }
        res.clear();
        permutor(num,0);
        return res;
    }
    public static void permutor(List<Integer> nums,int k)
    {
        for(int i=k;i<nums.size();i++)
        {
            Collections.swap(nums, i , k);
            permutor(nums, k+1);
            Collections.swap(nums, k, i);
        }
        if(k == nums.size()-1)
        {
            List<Integer> temp = new ArrayList<Integer>();
            for(int j: nums)
            {
                temp.add(j);
            }
            res.add(temp);
        }
    }
}