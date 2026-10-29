class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<Integer>();
        minStack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty() || val <= minStack.get(minStack.size()-1)){
            minStack.add(val);
        }
        else {
            minStack.add(minStack.get(minStack.size()-1));
        }
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        minStack.remove(minStack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}
