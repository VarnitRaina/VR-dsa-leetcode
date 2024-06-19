class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    ListNode head;
    int size;
    
    public MyLinkedList() {
        head=new ListNode(0);
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        ListNode temp=head;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
       if(index>size)return;
       size++;
       ListNode temp=head;
       for(int i=0;i<index;i++){
        temp=temp.next;
       }
       ListNode newNode=new ListNode(val);
       newNode.next=temp.next;
       temp.next=newNode;

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)return;
        size--;
        if(index==0){
            head=head.next;
            return;
        }
        ListNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
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