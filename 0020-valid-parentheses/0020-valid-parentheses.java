class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> ch = new Stack<>();
        for ( char c : s.toCharArray()){
            if( c == '(' || c == '{' || c == '['){
                ch.push(c);
            }else{
                if( ch.isEmpty()){
                    System.out.println("Invalid");
                    return false;
                }
                char top = ch.pop();
                if( c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '['){
                    System.out.println("invalid");
                    return false;
                }
            }
        }
        return ch.isEmpty();
        
    }
}