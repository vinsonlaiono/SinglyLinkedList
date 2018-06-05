import java.util.ArrayList;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }// End add method

    // Method removes the node with the given value
    public void remove() {
        if(head == null) {
            System.out.println("Empty List");
        } else {
            Node current = head;
            Node runner = head.next;
            while(runner.next != null) {
                current = runner;
                runner = runner.next;
            }
            current.next = null;
        }
    } // End remove method

    // Print all values in list
    public void printValues() {
        ArrayList<Object> list = new ArrayList();
        Node runner = head;
        while(runner != null) {
            list.add(runner.value);
            runner = runner.next;
        }
        System.out.println(list);
    }

    public int find(int num) {
        if(head == null) {
            // System.out.println("Empty List");
            return 404;
        } else {
            Node runner = head;
            int temp =0;

            while(runner != null) {
                if(runner.value == num ){
                    temp = runner.value;
                }
            runner = runner.next;
            }
        System.out.println("We have found the node with the value: " + temp);
        return temp;
        }
    }
}