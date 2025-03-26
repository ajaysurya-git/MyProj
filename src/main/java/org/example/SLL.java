package org.example;

public class SLL {
    public void insertFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
            size = 1;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    public void insertLast(int data) {
        if (head == null) {
            insertFirst(data);
        }
        else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insertAfter(int data, int afterData) {
        Node node = new Node(data);
        Node temp = head;
        while (temp.data != afterData) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void insertBefore(int data, int beforeData) {
        Node node = new Node(data);
        Node temp = head;
        while(temp.next.data != beforeData) {
            temp = temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public void insert(int data, int position) {
        Node node = new Node(data);
        if(position == 0) {
            insertFirst(data);
        }
        else if(position == size){
            insertLast(data);
        }
        else if(1<=position && position<=(size-1)) {
            Node temp = head;
            for(int i=0; i<position;i++){
                temp=temp.next;
                //System.out.print(temp.data+" ");
            }
            insertBefore(data,temp.data);
        }
        else {
            System.out.println("Enter a valid position");
        }

    }

    public void display(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print("->" + tmp.data);
            tmp = tmp.next;
        }
        System.out.println("->");
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty");
        }
        else {
            head = head.next;
            size --;
        }
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("List is Empty");
        }
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void deleteAfter(int afterData){
        Node temp = head;
        while(temp.data != afterData){
            temp = temp.next;
        }
        if(temp.next ==null){
            deleteFirst();
        }
        else if(temp.next.next == null){
            deleteLast();
        }
        else {
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }

    public void deleteBefore(int beforeData){
        Node temp = head;
        while(temp.next.next.data != beforeData){
            temp = temp.next;
        }
        if(temp.next == null){
            deleteFirst();
        }
        else if(temp.next.next == null){
            deleteLast();
        }
        else {
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }

    public void delete(int position){
        if(position == 0){
            deleteFirst();
        }
        else if(position == size){
            deleteLast();
        }
        else if(1<=position && position<=(size-1)){
            Node temp = head;
            for(int i=0; i<position;i++){
                temp=temp.next;
            }
            deleteBefore(temp.data);
            size--;
        }
        else {
            System.out.println("Enter a valid position");
        }
    }







    private class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data =data;
        }
        public Node(Node next) {
            this.next = next;
        }
        public Node(int data,Node next) {
            this.data =data;
            this.next =next;
        }
    }
    private Node head;
    private Node tail;
    public int size = 0;


}
