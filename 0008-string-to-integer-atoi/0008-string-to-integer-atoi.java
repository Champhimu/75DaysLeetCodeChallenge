class Solution {
    static final int INT_MIN = Integer.MIN_VALUE;
    static final int INT_MAX = Integer.MAX_VALUE;

    static int helper(String s, int i, long num, int sign){
        // BASE CASE
        if(i >= s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }

        num = num*10+(s.charAt(i) - '0');

        // Handle Overflow
        if(sign*num <= INT_MIN) return INT_MIN;
        if(sign*num >= INT_MAX) return INT_MAX;

        return helper(s, i+1, num, sign);
    }

    public int myAtoi(String s) {
        int i=0;
        //Ignore whitespace
        while(i < s.length() && s.charAt(i) == ' ') i++;

        //Handle sign
        int sign = 1; //default positive
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return helper(s, i, 0, sign);    
    }
}