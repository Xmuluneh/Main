package Muluneh;

public class StackLinkedList {
    class Node {
        int element;
        Node next;

        public Node(int e, Node n) {
            this.element = e;
            this.next = n;

        }

    }

    private Node top;
    private int size;

    public StackLinkedList() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int e) {
        Node node = new Node(e, null);
        if (isEmpty())
            top = node;
         else
            node.next = top;
            top = node;

            size++;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int e = top.element;
            top = top.next;
            size--;
            return e;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return top.element;
        }
    }

    public void display() {
        Node p = top;
        while (p != null) {
            System.out.print(p.element + ",");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
       stackLinkedList.push(3);
        stackLinkedList.push(2);
        stackLinkedList.display();
        int p=stackLinkedList.peek();
        System.out.println(p);

    }

}
