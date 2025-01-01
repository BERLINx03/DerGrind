class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        int max = -1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '1') ones++;
        }
        if(s.charAt(0) == '0') zeros++;
        for (int i = 1; i < s.length(); i++) {
            max = Math.max(max,ones+zeros);
            if(s.charAt(i) == '0')
                zeros++;
            else
                ones--;
        }
        return max;
    }
}