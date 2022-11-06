class MyCircularQueue {

    private int front;
    private int rear;
    private int arr[];
    private int cap;
    
    private int next(int i)
    {return (i+1)%cap;}
    
    private int prev(int i)
    {return (i+cap-1)%cap;}//cheating
    
    
    public MyCircularQueue(int k) {
        //initialize
        arr=new int[k];
        cap=k;
        front=-1;rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        if(front==-1){
            front=0;
            rear=0;
            arr[rear]=value;
            return true;
        }
        rear = next(rear);
        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front==rear)
        {
            rear=prev(rear);
            rear=-1;
            front=-1;
            return true;
        }
        front=next(front);
        return true;
    }
    
    public int Front() {
        if(front==-1) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(rear==-1) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return front==-1?true:false;
    }
    
    public boolean isFull() {
        return next(rear)==front?true:false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */