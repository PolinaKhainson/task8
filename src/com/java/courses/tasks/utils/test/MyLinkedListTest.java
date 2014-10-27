package com.java.courses.tasks.utils.test;

import com.java.courses.tasks.task8.task8_2.MyLinkedList;
public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("1");
        myLinkedList.add("---");
        myLinkedList.add(0);
        myLinkedList.add(88);
        myLinkedList.add(565.56);
        myLinkedList.add(0.5);
        myLinkedList.add('c');

        System.out.println("Двусвязный список Linked List:: " + myLinkedList);
        System.out.println("Получить Размер Linked List: " + myLinkedList.size());
        System.out.println("Получить третий элемент: " + myLinkedList.get(3));
        System.out.println("Удалить второй элемент: " + myLinkedList.remove(2));
        System.out.println("Получить третий элемент: " + myLinkedList.get(3));
        System.out.println("Получить размер Linked List:: " + myLinkedList.size());
        // добавить на указанное место
        myLinkedList.add(555,1);
        System.out.println("Вывести список на экран " + myLinkedList);

    }
}
