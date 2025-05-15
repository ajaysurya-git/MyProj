package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        SLL sll = new SLL();
//        sll.insertFirst(5);
//        sll.display();
//        sll.insertFirst(7);
//        sll.display();
//        sll.insertLast(10);
//        sll.display();
//        sll.insertFirst(3);
//        sll.display();
//        sll.insertAfter(12, 7);
//        sll.display();
//        sll.insertBefore(18,10);
//        sll.display();
//        sll.insert(13, 0);
//        sll.display();
//        sll.insert(16, 7);
//        sll.display();
//        sll.insert(22,3);
//        sll.display();
//        sll.deleteFirst();
//        sll.display();
//        sll.deleteLast();
//        sll.display();
//        sll.deleteAfter(5);
//        sll.display();
//        sll.deleteBefore(12);
//        sll.display();
//        sll.delete(8);
//        sll.display();
//        System.out.println("Size : "+sll.size);
//
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1,12);
//        list.addFirst(5);
//        list.addFirst(7);
//        list.addLast(10);
//        list.addFirst(3);
//        list.add(8, 12);
        //System.out.println(list);
        //System.out.println(list.size());

//        DLL dll = new DLL();
//        dll.insertFirst(8);
//        dll.display();
//        dll.insertFirst(6);
//        dll.display();
//        dll.insertFirst(5);
//        dll.display();
//        dll.insertFirst(2);
//        dll.display();
//        dll.insertLast(12);
//        dll.display();

//        Stack dll = new Stack();
//        dll.push(8);
//        dll.display();
//        dll.push(6);
//        dll.display();
//        dll.push(5);
//        dll.display();
//        dll.push(2);
//        dll.display();

        Queue queue = new Queue();
        queue.enQueue(2);
        queue.display();
        queue.enQueue(3);
        queue.display();
        queue.enQueue(4);
        queue.display();
        queue.enQueue(5);
        queue.display();
        queue.reverseDisplay();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
    }
}