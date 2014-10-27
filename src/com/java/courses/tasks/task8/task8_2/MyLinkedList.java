package com.java.courses.tasks.task8.task8_2;


public class MyLinkedList {
    private Node head;
    private int listCount;

    public MyLinkedList() {

        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data) {
        if (data instanceof Number) {
            System.out.println("This element is a Number");
            Node temp = new Node(data);
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
            listCount++;
        } else {
            System.out.println("This element is not a Number");
        }
    }

    public void add(Object data, int index)
    {if (data instanceof Number) {
        Node temp = new Node(data);
        Node current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
    } else {
        System.out.println("This element is not a Number");
    }
    }

    public Object get(int index)
    {
        if (index <= 0)
            return null;
        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index)
    {
       if (index < 1 || index > size())
            return false;

        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return false;

            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public int size()
    {
        return listCount;
    }

    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }

    private class Node {
        Node next;
        Object data;

        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }


        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}