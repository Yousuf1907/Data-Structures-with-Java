class LL{
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node head;
    //Add First, Add Last
    public void AddFirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    } 
    public static void main(String args[]){
        LL list =new LL();

         
    }
} 