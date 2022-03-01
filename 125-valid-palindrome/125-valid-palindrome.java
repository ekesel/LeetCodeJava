class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for(int i =0;i<s.length();i++)
        {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >=48 && s.charAt(i) <= 57))
                str += s.charAt(i);
        }
        int i =0;
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}