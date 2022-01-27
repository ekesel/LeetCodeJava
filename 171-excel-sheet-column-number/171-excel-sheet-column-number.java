class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        char[] c=columnTitle.toCharArray();
        for(int i=0;i<c.length;i++){
            result*=26;
            result+=c[i]-'A'+1;
        }
        return result;
    }
}