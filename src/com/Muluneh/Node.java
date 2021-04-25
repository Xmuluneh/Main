package com.Muluneh;

public class Node {
    public  int element;
   public  Node next;
   public  Node prev;

    public Node(int e,Node n) {
        this.element = e;
        this.next=n;
    }
    public Node(int e,Node n,Node p){
        this.element=e;
        this.next=n;
        this.prev=p;
    }
}
