package DataStructure;

public class Runner {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(12,"Raducu");
        linkedList.add(18,"Ivan");
        linkedList.add(22, "Stoica");


        linkedList.show();
        linkedList.count();
        System.out.println(linkedList.isExist(12,"Stoica"));
    }
}
