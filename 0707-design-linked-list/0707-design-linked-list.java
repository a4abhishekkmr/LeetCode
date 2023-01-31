class ListNode{
    int value;
    ListNode next;
    ListNode(int val)
    {
        this.value=val;
    }
}

class MyLinkedList {
        int size;
        ListNode dummy;
    
    public MyLinkedList() {
        dummy=new ListNode(-1);
        size=0;
    }
    
    public int get(int index) {
        if(index>=size) return -1;
        ListNode curr=dummy;
        for(int i=0;i<=index;i++)
            curr=curr.next;
        
        return curr.value;
    }
    
    public void addAtHead(int val) {
        ListNode node=new ListNode(val);
        node.next=dummy.next;
        dummy.next=node;//ye kyu
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode node=new ListNode(val);
        ListNode curr=dummy;
        for(int i=0;i<size;i++)
            curr=curr.next;
        
        curr.next=node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        ListNode node=new ListNode(val);
        ListNode curr=dummy;
        for(int i=0;i<index;i++)
            curr=curr.next;
        
        node.next=curr.next;
        curr.next=node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size) return;
        
        ListNode curr=dummy;
        for(int i=0;i<index;i++)
            curr=curr.next;
        
        curr.next=curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */