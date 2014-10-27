package com.java.courses.tasks.task8.task8_3;

import java.util.Iterator;

public class HashSet {
    private Node[] buckets;
    private int currentSize;
    private int current;

    public HashSet(int bucketsLength)    {
        buckets = new Node[bucketsLength];
        currentSize  = 0;
    }

    public boolean contains(Object x)    {
        return false;
    }

    public boolean add(Object x)    {
        int key = gethashcode(x);
        Node node = buckets[key];

        if(buckets[current] == null){
            node = new Node(x);
            current = key;
            buckets[key] = node;
            currentSize++;
        }else{
            node = new Node(x);
            node.next = buckets[current];
            current = key;
            buckets[key] = node;
            currentSize++;
        }
        System.out.println("add successful "+ x);
        System.out.println(" size "+currentSize+" rehash "+buckets.length*0.75);

        if(currentSize>(buckets.length*0.75)){
            rehash();
        }
        return true;
    }

    private void rehash() {
        Node temp = buckets[current];
        Object s[] = new Object[buckets.length];
        buckets = new Node[2*buckets.length];
        currentSize = 0;
        int i = 0;
        while(temp != null){
            s[i] = temp.data;
            temp = temp.next;
            i++;
        }
        while(i > 0){
            add(s[--i]);
        }
    }


    public boolean remove(Object x){
        return false;
       }

    public int gethashcode(Object x) {
        int hc = x.hashCode();
        if(hc < 0)
            hc =- hc;
        return (hc%buckets.length);
    }

    public Iterator<Object> iterator() {
        Iterator <Object> i = new HashSetIterator();
        return i;
//
    }

    public int size() {
        return currentSize;
    }

    private void resize(int newLength)
    {
    }

    public int getlength(){
        return buckets.length;
    }

    class Node {
     public Object data;
        public Node next;
        public Node(Object x) {
            data=x;
        }
        public String toString(){
            return data.toString();
        }
    }

    class HashSetIterator implements Iterator<Object> {
        private int bucket=0;
        private Node currentnode;
        public HashSetIterator() {
            currentnode=buckets[current];
        }
        public boolean hasNext() {
            if(currentnode.next!=null)
                return true;
            else
                return false;
        }

        public Object next() {
            return currentnode.next;
        }

        @Override
        public void remove() {
            currentnode.next=currentnode.next.next;
        }
    }
}
