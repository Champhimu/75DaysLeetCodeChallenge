class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(!s1.isEmpty() && s1.peek() == '('){
                    s1.pop();
                }else{
                    return false;
                }
            }else if(ch == '}'){
                if(!s1.isEmpty() && s1.peek() == '{'){
                    s1.pop();
                }else{
                    return false;
                }
            }else if(ch == ']'){
                if(!s1.isEmpty() && s1.peek() == '['){
                    s1.pop();
                }else{
                    return false;
                }
            }else{
                s1.push(s.charAt(i));
            }
        }
        return s1.isEmpty();
    }
}