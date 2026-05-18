class Solution {
    public boolean isValid(String s) {

        Stack<Character> temp = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                temp.push(c);
            } else if(c == ']'){
                var t = temp.pop();
                if(t != '['){
                    return false;
                }
            } else if(c == ')'){
                var t = temp.pop();
                if(t != '('){
                    return false;
                }
            } else if(c == '}'){
                var t = temp.pop();
                if(t != '{'){
                    return false;
                }
            }

            // System.out.println(temp);
            
        }

        return temp.isEmpty();
        
    }
}
