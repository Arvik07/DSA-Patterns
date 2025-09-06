class MyStack {
    public Queue<Integer> q1;
    public Queue<Integer> q2; 
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        int ans=q1.remove();
        return ans;
    }
    
    public int top() {
        int ans = q1.peek();
        return ans;
    }
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
