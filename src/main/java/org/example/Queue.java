package org.example;

public class Queue {

    public void enQueue(int data){
        Node node = new Node(data);
        if(front == null){
            front = node;
            rear = node;
            size = 1;
            return;
        }
        node.prev = rear;
        rear.next =node;
        rear = node;
        size++;

    }
    public void deQueue() {
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            System.out.println("IF 1");
            front =null;
            rear = null;
            size=0;
            return;
        }
        System.out.println("IF 2");
        front = front.next;
        front.prev =null;
        size--;
    }

    public void display(){
        Node tmp = front;
        while(tmp !=null){
            System.out.print(" -> " + tmp.data + " <- ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void reverseDisplay(){
        Node tmp =rear;
        while(tmp!=null) {
            System.out.print("->" + tmp.data);
            tmp = tmp.prev;
        }
        System.out.println();
    }





    private class Node {
        Node prev;
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
        }

    }

    private Node front;
    private Node rear;
    private int size;
}
