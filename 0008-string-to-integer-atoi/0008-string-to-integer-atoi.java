class Solution {
    
    static int helper(String s, int i, long val, int sign){

        //Base case
        if(i >= s.length() || !Character.isDigit(s.charAt(i))){
            return (int) (sign*val);
        }
        val = val*10 + (s.charAt(i)-'0');
        if(sign*val <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(sign*val >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return helper(s,i+1,val,sign);
    }

    public int myAtoi(String s) {
        int i=0;
        
        //Remove whitespace
        while(i<s.length() && s.charAt(i) == ' ') i++;

        //handle sign
        int sign = 1;
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return helper(s, i, 0, sign);
    }
}