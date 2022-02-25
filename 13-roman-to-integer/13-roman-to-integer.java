class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
        
        int sum = 0;
        sum += mapping.get(s.charAt(s.length() - 1));
        
        for(int i = s.length() - 2; i >= 0; i--) {
            char curr = s.charAt(i);
            char next = s.charAt(i + 1);
            if(mapping.get(curr) < mapping.get(next)) {
                sum -= mapping.get(curr);
            }
            else {
                sum += mapping.get(curr);
            }
        }
        
        return sum;
    }
}