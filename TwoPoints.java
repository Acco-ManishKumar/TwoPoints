public class TwoPoints {
    public static void main(String[] args) {
        computePointOfInterception(2, 4);
        //computePointOfInterception(12, 4);
        //computePointOfInterception(8, 4);
        //computePointOfInterception(2, 9);
    }
    public static int computePointOfInterception(int x, int y) {
        circularLinkedList circle = new circularLinkedList();
        for(int i=1; i<=12; i++){
            circle.addNode(i);
        }
        //circle.traverseList();
        Node PointerX = circle.head;
        for(int i=1; i<x; i++){
            PointerX = PointerX.nextNode;
        }
        //System.out.println("Initial Position of Node X : "+PointerX.value);
        Node PointerY = circle.head;
        for(int i=1; i<y; i++){
            PointerY = PointerY.nextNode;
        }
        //System.out.println("Initial position of Node Y : "+PointerY.value);
        while(PointerX.value != PointerY.value){
            PointerX = PointerX.nextNode.nextNode;
            PointerY = PointerY.nextNode;
        }
        //System.out.println("First Point of Intersection : "+PointerX.value);
        System.out.println(PointerX.value);
        return 0;
    }
}

class circularLinkedList {
    Node head = null;
    Node tail = null;
    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }
        tail = newNode;
        tail.nextNode = head;
    }
}
class Node {
    int value;
    Node nextNode;
    public Node(int value) {
        this.value = value;
    }
}