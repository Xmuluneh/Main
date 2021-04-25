package Muluneh;

public class Doubly_LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Doubly_LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(String e) {
        Node node = new Node(e, null, null);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void display() {
        Node p = head;
        while (p != null) {
            System.out.print(p.element + ",");
            p = p.next;
        }
        System.out.println();
    }

    public void addFirst(String e) {
        Node node = new Node(e, null, null);
        if (isEmpty()) {
            head = tail = node;

        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAny(String e, int position) {
        Node node = new Node(e, null, null);
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addFirst(e);
            return;
        }
        Node p = head;
        int i = 0;
        while (i < position - 1) {
            p = p.next;
            i++;

        }
        node.next = p.next;
        p.next.prev = node;
        p.next = node;
        node.prev = p;
        size++;

    }

    public String deleteFirst() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return "" + -1;
        }
        String e = head.element;
        head = head.next;
        size--;
        if (isEmpty())
            tail = null;
        else {
            head.prev = null;
        }


        return e;
    }

    public String deleteLast() {
        if (isEmpty()) {
            System.out.println("the list is empty");
            return null;
        }
        String e = tail.element;
        tail = tail.prev;
        tail.next = null;
        return e;
    }
    public String deleteAny(int position){
        if(position<0||position>size){
            System.out.println("Invalid position");
        }
        if(position==0){
            return deleteFirst();
        }
        Node p=head;
        int i=1;
        while (i<position-1){
            p=p.next;
            i++;
        }
        String e=p.next.element;
        p.next=p.next.next;
        p.next.prev=p;
        size--;
        return e;
    }


}
