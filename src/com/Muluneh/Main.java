package com.Muluneh;

import Muluneh.Doubly_LinkedList;

public class Main {

    public static void main(String[] args) {
        CircularLinkList circularLinkList=new CircularLinkList();
        Doubly_LinkedList doubly_linkedList=new Doubly_LinkedList();

        doubly_linkedList.addLast("Jone");
        doubly_linkedList.addFirst("root");
        doubly_linkedList.addLast("Mike");
        doubly_linkedList.addAny("Rock",0);
        doubly_linkedList.deleteFirst();
        doubly_linkedList.deleteLast();
        System.out.println("The doubly linked list is :"+doubly_linkedList.length());
        doubly_linkedList.display();

        circularLinkList.addLast(70);
        circularLinkList.addLast(80);
        circularLinkList.addLast(60);
        circularLinkList.addLast(50);
        circularLinkList.addFirst(20);
        System.out.println("The size of the list is "+ circularLinkList.length());
        circularLinkList.display();
        System.out.println();
        circularLinkList.deleteAny(0);
        circularLinkList.addAny(5,3);
        circularLinkList.display();
    }
}
