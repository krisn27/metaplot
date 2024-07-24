
public class r15 {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    //add-first,last
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    //add-last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print(" NULL");
    }

    public static void main(String args[]) {
        r15 list = new r15();

        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.printlist();

    }
}
