class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> operators = new HashSet(Arrays.asList("+", "-", "*", "/"));
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++){
            String current = tokens[i];
            if (operators.contains(current)){
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                stack.push(String.valueOf(evaluate(current, a, b)));
            }
            else {
                stack.push(current);
            }
        }
        return Integer.valueOf(stack.pop());
    }

    public int evaluate(String operator, int a, int b){
        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return -1;
        }
    }

}
