package car;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;  
            curr.next = prev;       
            prev = curr;            
            curr = next;
        }

        return prev;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(30);

        System.out.println("Original list:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed list:");
        printList(head);
    }
}
