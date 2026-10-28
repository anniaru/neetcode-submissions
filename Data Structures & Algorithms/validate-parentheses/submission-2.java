class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            // if there is an opening bracket, push to the stack
            if (map.containsKey(current)){
                if (stack.isEmpty() || !stack.pop().equals(map.get(current))){
                   return false;
                }
            } 
            else {
                stack.push(current);
            }
        }

        return stack.isEmpty();
    }
}
