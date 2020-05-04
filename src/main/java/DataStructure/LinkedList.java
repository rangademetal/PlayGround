package DataStructure;

public class LinkedList {
    Student head;

    public void add(int age, String name){
        Student node = new Student();
        node.age = age;
        node.name = name;
        node.next = null;
        if(head == null) {
            head = node;
        }
        else {
            Student n = head;
            while(n.next!= null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show() {
        Student node = head;
        while(node.next!= null) {
            System.out.println(node.age+" "+node.name);
            node = node.next;
        }
        System.out.println(node.age+" "+node.name);
    }
    public void count() {
        Student node = head;
        int count = 1;
        while(node.next != null) {
            node = node.next;
            count++;
        }
        System.out.println(count);
    }

    public boolean isExist(int age, String name) {
        Student node = head;
        while(node.next != null) {

            if(node.age == age && node.name == name)
                return true;
             node = node.next;
        }
        return false;
    }
}
