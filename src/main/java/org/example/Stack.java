package org.example;

public class Stack {

    public void push(int data) {
        Node node = new Node(data);
        if(top == null) {
            top = node;
            return;
        }
        top.prev = node;
        node.next = top;
        top = node;
    }

    public void display() {
        Node tmp = top;
        while(tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }


    private class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
        }
    }

    private Node top;
}
