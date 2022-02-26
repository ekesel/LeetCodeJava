class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.length() <= 0 || haystack.equals(needle)) return 0;
        String check;
        int nlength = needle.length();
        for(int i = 0; i < haystack.length()-(nlength-1); i++) {
            check = haystack.substring(i,i+nlength);
            if(check.equals(needle)) return i;
        }
        return -1;
    }
}