package org.example;

import org.w3c.dom.Node;

public class DLL {

    public void insertFirst(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
            tail = node;
            size = 1;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(int data) {
        Node node = new Node(data);
        if(head == null) {
            insertFirst(data);
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }


    public void display() {
        Node tmp = head;
        while(tmp != null) {
            System.out.print(" -> " + tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }



    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
}
