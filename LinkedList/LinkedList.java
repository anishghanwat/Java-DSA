public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // assuming the default node is not pointing to any node
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step 1: create new Node
        Node newNode = new Node(data);

        // if linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: newNode next = head
        newNode.next = head;

        // Step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // Step 1: create new node
        Node newNode = new Node(data);
        // if linkedlist is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: tail next = newNode
        tail.next = newNode;

        // Step 3: tail = newNode
        tail = newNode;
    }

    public void print() {
        // assign head vale to temp
        Node temp = head;

        // loop on temp
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
