class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> open = new ArrayList<Character>(Arrays.asList('(', '{', '['));
        ArrayList<Character> close = new ArrayList<Character>(Arrays.asList(')', '}', ']'));
        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            // if there is an opening bracket, push to the stack
            if (open.contains(current)){
                stack.push(current);
            }
            else if (close.contains(current)){
                // if stack isn't empty, check top element, if top element is the corresponding open bracket, pop it
                if (!stack.isEmpty()){
                    int closeIdx = close.indexOf(current);
                    if (open.get(closeIdx) == stack.peek()){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
                // if stack is empty and there is a close bracket
                else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
