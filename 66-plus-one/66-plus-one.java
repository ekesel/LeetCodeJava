import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for(int i: digits) {
            str += Integer.toString(i);
        }
        BigInteger bi = new BigInteger(str);
        BigInteger sum = bi.add(new BigInteger("1"));
        String ans = sum.toString();
        int res[] = new int[ans.length()];
        for(int i=0;i<ans.length();i++)
        {
            res[i] += Character.getNumericValue(ans.charAt(i));
        }
        return res;
    }
}