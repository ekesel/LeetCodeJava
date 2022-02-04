class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length())
            return ans;
        
        int pHash = getHash(p);
        
        int rollingHash = getHash(s, 0, p.length());
        for(int i=0;i<= s.length()-p.length();i++){
            if(rollingHash == pHash){
                //compare the anagram now
                String subString = s.substring(i, i + p.length());
                if(compareAnagram(subString, p))
                    ans.add(i);
            }
            if(p.length() + i < s.length())
                rollingHash = rollingHash - s.charAt(i) + s.charAt(p.length() + i);
        }
        return ans;
    }
    
    private boolean compareAnagram(String str1, String str2){
        int[] freq = new int[256];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0)
                return false;
        }
        return true;
    }
    private int getHash(String str){
        int hash = 0;
        for(int i=0;i<str.length();i++){
            hash += str.charAt(i);
        }
        return hash;
    }
    
    private int getHash(String str, int start, int end){
        int hash = 0;
        for(int i=start;i<end;i++){
            hash += str.charAt(i);
        }
        return hash;
    }
}
