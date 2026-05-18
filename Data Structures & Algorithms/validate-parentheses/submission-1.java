class Solution {
    public boolean isValid(String s) {

        Stack<Character> temp = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                temp.push(c);
            } else if(c == ']'){
                if(temp.isEmpty() || temp.pop() != '['){
                    return false;
                }
            } else if(c == ')'){
                if(temp.isEmpty() || temp.pop() != '('){
                    return false;
                }
            } else if(c == '}'){
                if(temp.isEmpty() || temp.pop() != '{'){
                    return false;
                }
            }

            // System.out.println(temp);
            
        }

        return temp.isEmpty();
        
    }
}
