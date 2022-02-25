class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int res = Integer.MIN_VALUE;
        while(i<j)
        {
            int currarea = getArea(height[i],height[j],i,j);
            res = Math.max(res,currarea);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return res;
    }
    public static int getArea(int start, int end,int i, int j)
    {
        return (j-i) * Math.min(start,end);
    }
}