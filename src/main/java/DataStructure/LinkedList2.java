package DataStructure;

public class LinkedList2 {
    Node head;
    public void add(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        if(head == null)
            head=n;
        else {
            Node ne = head;
            while (ne.next != null) {
                ne = ne.next;
            }
            ne.next = n;
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
        LinkedList2 link = new LinkedList2();
        link.add(2);
        link.add(56);
        link.add(-2);

        link.show();
    }
}
