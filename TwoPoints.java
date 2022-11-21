import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {
        int x,y;
        do {
            System.out.print("Enter first node(1-12) : ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
        }while (x > 12  || x <1);
        do {
            System.out.print("Enter second node(1-12) : ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextInt();
        }while(y > 12 || y < 1);
        computePointOfInterception(x, y);

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
        System.out.println("Node at which both nodes meet : "+PointerX.value);
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