class MinStack {
    Stack<Integer> stack;
    Stack<Integer> Minstack;
    public MinStack() {
        stack=new Stack<>();
        Minstack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(Minstack.empty()){
            Minstack.push(val);
        }
        else if(val<Minstack.peek()){
            Minstack.push(val);
        }
        else{
            Minstack.push(Minstack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        Minstack.pop();
    }
    
    public int top() {
      return stack.peek();
    }
    
    public int getMin() {
       return Minstack.peek();
    } 
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
