package com.Muluneh;

public class CircularLinkList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        Node node = new Node(e, null);
        if (isEmpty()) {
            node.next = node;
            head = node;

        } else {
            node.next = tail.next;
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void addFirst(int e) {
        Node node = new Node(e, null);
        if (isEmpty()) {
            node.next = node;
            head=node;
        } else {
            tail.next = node;
            node.next = head;
        }
        head = node;
        size++;
    }

    public void addAny(int e, int position) {
        Node node = new Node(e, null);
        if (isEmpty()) {
            addFirst(e);
        } else {
            Node p = head;
            int i = 0;
            while (i < position - 1) {
                p = p.next;
                i++;

            }
            node.next = p.next;
            p.next = node;

        }
        size++;
    }

    public void display() {
        Node p = head;
        int i = 0;
        while (i < length()) {
            System.out.print(p.element + ",");
            p = p.next;
            i++;
        }
        System.out.println();
    }

    public int deleteFirst() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return -1;
        } else {
            int e = head.element;
            tail.next = head.next;
            head = head.next;
            size--;
            if (isEmpty())
                head = tail = null;
            return e;

        }
    }

    public int deleteLast() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return -1;
        } else {
            Node p = head;
            int i = 1;
            while (i < length() - 1) {
                p = p.next;
                i++;
            }
            tail = p;
            p = p.next;
            tail.next = head;
            int e = p.element;
            size--;
            return e;
        }
    }

    public int deleteAny(int position) {
        if (position < 0 || position > size) {
            System.out.println("The list is empty");
        }
        if (position == 0) {
            int e=deleteFirst();
            return e;
        }

        Node p = head;
        int i = 1;
        while (i < position - 1) {
            p = p.next;
            i++;
        }
        int e = p.next.element;
        p.next = p.next.next;
        size--;

        return e;

    }

}
