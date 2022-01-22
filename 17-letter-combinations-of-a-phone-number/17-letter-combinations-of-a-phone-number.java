class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
            ArrayList<String> emp = new ArrayList<>();
            return emp;
        }
        return helper(digits);
    }
    public static List<String> helper(String digits)
    {
        if(digits.length()==0)
        {
            ArrayList<String> emp = new ArrayList<>();
            emp.add("");
            return emp;
        }
        String firstCharValue = getValue(digits.charAt(0));
        List<String> smallProb = helper(digits.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<firstCharValue.length();i++)
        {
            for(int j=0;j<smallProb.size();j++)
            {
                String comb = firstCharValue.charAt(i)+smallProb.get(j);
                ans.add(comb);
            }
        }
        return ans;
    }
    public static String getValue(char c)
    {
        if(c == '2')
            return "abc";
        if(c == '3')
            return "def";
        if(c=='4')
            return "ghi";
        if(c=='5')
            return "jkl";
        if(c=='6')
            return "mno";
        if(c=='7')
            return "pqrs";
        if(c=='8')
            return "tuv";
        if(c=='9')
            return "wxyz";
        return "";
    }
}