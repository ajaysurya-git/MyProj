package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SLL sll = new SLL();
        sll.insertFirst(5);
        sll.display();
        sll.insertFirst(7);
        sll.display();
        sll.insertLast(10);
        sll.display();
        sll.insertFirst(3);
        sll.display();
        sll.insertAfter(12, 7);
        sll.display();
        sll.insertBefore(18,10);
        sll.display();
        sll.insert(13, 0);
        sll.display();
        sll.insert(16, 7);
        sll.display();
        sll.insert(22,3);
        sll.display();
        System.out.println("Size : "+sll.size);

        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1,12);
//        list.addFirst(5);
//        list.addFirst(7);
//        list.addLast(10);
//        list.addFirst(3);
//    list.add(8, 12);
        System.out.println(list);
        System.out.println(list.size());
    }
}