package Muluneh;

public class Node {
    public String element;
    public Node next;
    public Node prev;


    public Node(String e, Node n, Node p) {
        this.element = e;
        this.next = n;
        this.prev = p;


    }
}