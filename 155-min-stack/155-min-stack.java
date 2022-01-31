class MinStack {
        ArrayList<Integer> a;
    int min=Integer.MAX_VALUE;
    
    public MinStack() {
        a=new ArrayList<>();
    }
    
    public void push(int val) {
        if(val<this.min)
            this.min=val;
        
        this.a.add(val);
    }
    
    public void pop() {
        int n=this.a.size();
        
        this.a.remove(n-1);
        int minTemp=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(this.a.get(i)<minTemp)
                minTemp=this.a.get(i);
        }
        
        this.min=minTemp;
    }
    
    public int top() {
        int n=this.a.size();
        
        return this.a.get(n-1);
    }
    
    public int getMin() {
        return this.min;
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