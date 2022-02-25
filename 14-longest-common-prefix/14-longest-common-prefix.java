class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        if(strs.length == 1)
            return strs[0];
        String matcher = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            String pre = Prefix(matcher, strs[i]);
            if(pre == "")
                return "";
            if(pre.length()<common.length() || common == "")
                common = pre;
        }
        return common;
    }
    public static String Prefix(String a, String b)
    {
        int i = 0;
        String ans = "";
        while(i<a.length() && i < b.length())
        {
            if(a.charAt(i) != b.charAt(i))
                return ans;
            ans += a.charAt(i);
            i++;
        }
        return ans;
    }
}