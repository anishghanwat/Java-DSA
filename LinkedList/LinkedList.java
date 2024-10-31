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
    public static int size; // O(1) Constant

    // O(1) Constant
    public void addFirst(int data) {
        // Step 1: create new Node
        Node newNode = new Node(data);

        size++;

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

    // O(n) linear
    public void add(int index, int data) {
        // Add at head
        if (index == 0) {
            addFirst(data);
            return;
        }

        // Create new node
        Node newNode = new Node(data);

        size++;

        // Initialization
        Node temp = head;
        int i = 0;

        // Loop to find previous index
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // links
        // newNode to Index + 1
        newNode.next = temp.next;
        // previous to newNode
        temp.next = newNode;
    }

    // O(1) Constant
    public void addLast(int data) {
        // Step 1: create new node
        Node newNode = new Node(data);

        size++;

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

    // O(n) Linear
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

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = tail.data;
            head = tail = null;
            size = 0;
            return value;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int value = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    // O(n) Linear
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // O(n) Linear
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }
        // key found
        if (head.data == key) {
            return 0;
        }
        // recursive calls
        int index = helper(head.next, key);
        // key not found
        if (index == -1) {
            return -1;
        }
        // Index + 1
        return index + 1;
    }

    // Reverse of a Linked List
    // O(n) Linear
    public void reverse() {
        // Initialize prev, curr, next
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            // link curr next to prev, reverses the LL
            curr.next = prev;

            // Iterate
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        // Add First
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        // Add Last
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        // Add Middle
        ll.add(2, 9);
        ll.print();

        // Remove First
        ll.removeFirst();
        ll.print();

        // Remove Last
        ll.removeLast();
        ll.print();
        System.out.println("Size of LL: " + ll.size);

        // Iterative Search
        System.out.println("Found by Iterative Search: " + ll.iterativeSearch(3));

        // Recursive Search
        System.out.println("Found by Recursive Search: " + ll.recursiveSearch(3));

        // Reverse
        ll.reverse();
        ll.print();
    }
}
