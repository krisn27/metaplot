  class LinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;

    }
    void printList(Node node){
        while(node!=null){
        System.out.println(node.data+" ");
        node=node.next;
    }
}
   public static void main(String args[]){
    LinkedList list=new LinkedList();
    list.head=new Node(15);
    list.head.next=new Node(85);
    list.head.next.next=new Node(4);
    System.out.println("given linked list be:");
    list.printList(head);
    head=list.reverse(head);
    System.out.println(" ");
    System.out.println(" REVERSE OF LINKED LIST");
    list.printList(head);
    
   }


}
