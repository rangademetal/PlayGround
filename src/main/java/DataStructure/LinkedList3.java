package DataStructure;

public class LinkedList3 {
    Node head;
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
           head = node;
        else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while(node.next != null) {
            System.out.print("["+node.data+"] ");
            node = node.next;
        }
        System.out.print("["+node.data+"] ");
    }

    public static void main(String args[]) {
        LinkedList3 link = new LinkedList3();
        link.insert(3);
        link.insert(6);
        link.insert(34);

        link.show();
    }
}
