package com.java.courses.tasks.task8.task8_1;

import java.util.*;

public class CollectionsComparing {
    public void compareListsAdd(ArrayList al, LinkedList ll) {
        // ADD FIRST in ArrayList
        long startTimeArrayListAddFirstElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)al.add(0,57);
        long endTimeArrayListAddFirstElement = System.currentTimeMillis();
        // ADD FIRST in LinkedList
        long startTimeLinkedListAddFirstElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)ll.add(0,57);
        long endTimeLinkedListAddFirstElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeAddArrayListFirstElement = endTimeArrayListAddFirstElement - startTimeArrayListAddFirstElement;
        long timeAddLinkedListFirstElement = endTimeLinkedListAddFirstElement - startTimeLinkedListAddFirstElement;
        System.out.println("\n Время добавления первого элемента в Array list:" + timeAddArrayListFirstElement);
        System.out.println("Время добавления первого элемента в Linked list:" + timeAddLinkedListFirstElement);

        // ADD LAST in ArrayList
        long startTimeArrayListAddLastElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++) al.add(57);
        long endTimeArrayListAddLastElement = System.currentTimeMillis();
        // ADD LAST in LinkedList
        long startTimeLinkedListAddLastElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)ll.add(57);
        long endTimeLinkedListAddLastElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeAddArrayListLastElement = endTimeArrayListAddLastElement - startTimeArrayListAddLastElement;
        long timeAddLinkedListLastElement = endTimeLinkedListAddLastElement - startTimeLinkedListAddLastElement;
        System.out.println("\n Время добавления последнего  в Array list:" + timeAddArrayListLastElement);
        System.out.println("Время добавления последнего в Linked list:" + timeAddLinkedListLastElement);

        // ADD MIDDLE in ArrayList
        long startTimeArrayListAddMiddleElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)al.add(al.size()/2,  57);
        long endTimeArrayListAddMiddleElement = System.currentTimeMillis();
        // ADD MIDDLE in  LinkedList
        long startTimeLinkedListAddMiddleElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)ll.add(al.size()/2, 57);
        long endTimeLinkedListAddMiddleElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeAddArrayListMiddleElement = endTimeArrayListAddMiddleElement - startTimeArrayListAddMiddleElement;
        long timeAddLinkedListMiddleElement = endTimeLinkedListAddMiddleElement - startTimeLinkedListAddMiddleElement;
        System.out.println("\n Время добавления в середину Array list:" + timeAddArrayListMiddleElement);
        System.out.println("Время добавления  в середину Linked list:" + timeAddLinkedListMiddleElement);

        // итоговые списки



    }

        public void compareListsGet(ArrayList al, LinkedList ll) {
            // GET FIRST in ArrayList
            long startTimeArrayListGetFirstElement = System.currentTimeMillis();
            for(int j = 0; j < 10000; j++)al.get(0);
            long endTimeArrayListGetFirstElement = System.currentTimeMillis();
            // GET FIRST in LinkedList
            long startTimeLinkedListGetFirstElement = System.currentTimeMillis();
            for(int j = 0; j < 10000; j++)ll.get(0);
            long endTimeLinkedListGetFirstElement = System.currentTimeMillis();
            // TIME RESULTS
            long timeGetArrayListFirstElement = endTimeArrayListGetFirstElement - startTimeArrayListGetFirstElement;
            long timeGetLinkedListFirstElement = endTimeLinkedListGetFirstElement - startTimeLinkedListGetFirstElement;
            System.out.println("\n Время получения первого элемента в Array list:" + timeGetArrayListFirstElement);
            System.out.println("Время получения первого элемента в Linked list:" + timeGetLinkedListFirstElement);

            // GET LAST in ArrayList
            long startTimeArrayListGetLastElement = System.currentTimeMillis();
            for(int j = 0; j < 10000; j++) al.get(al.size()-1);
            long endTimeArrayListGetLastElement = System.currentTimeMillis();
            // GET LAST in LinkedList
            long startTimeLinkedListGetLastElement = System.currentTimeMillis();
            for(int j = 0; j < 10000; j++)ll.get(al.size()-1);
            long endTimeLinkedListGetLastElement = System.currentTimeMillis();
            // TIME RESULTS
            long timeGetArrayListLastElement = endTimeArrayListGetLastElement - startTimeArrayListGetLastElement;
            long timeGetLinkedListLastElement = endTimeLinkedListGetLastElement - startTimeLinkedListGetLastElement;
            System.out.println("\n Время получения последнего  в Array list:" + timeGetArrayListLastElement);
            System.out.println("Время получения последнего в Linked list:" + timeGetLinkedListLastElement);

            // GET MIDDLE in ArrayList
            long startTimeArrayListGetMiddleElement = System.currentTimeMillis();
            for(int j = 0; j < 10000; j++)al.add(al.size()/2);
            long endTimeArrayListGetMiddleElement = System.currentTimeMillis();
            // GET MIDDLE in  LinkedList
            long startTimeLinkedListGetMiddleElement = System.currentTimeMillis();
            for(int j = 0; j < 10000; j++)ll.add(al.size()/2);
            long endTimeLinkedListGetMiddleElement = System.currentTimeMillis();
            // TIME RESULTS
            long timeGetArrayListMiddleElement = endTimeArrayListGetMiddleElement - startTimeArrayListGetMiddleElement;
            long timeGetLinkedListMiddleElement = endTimeLinkedListGetMiddleElement - startTimeLinkedListGetMiddleElement;
            System.out.println("\n Время получения элемента из середины Array list:" + timeGetArrayListMiddleElement);
            System.out.println("Время получения  элемента из середины Linked list:" + timeGetLinkedListMiddleElement);
        }
    public void compareListsRemove(ArrayList al, LinkedList ll) {
        // GET FIRST in ArrayList
        long startTimeArrayListRemoveFirstElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)al.remove(0);
        long endTimeArrayListRemoveFirstElement = System.currentTimeMillis();
        // GET FIRST in LinkedList
        long startTimeLinkedListRemoveFirstElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)ll.remove(0);
        long endTimeLinkedListRemoveFirstElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeRemoveArrayListFirstElement = endTimeArrayListRemoveFirstElement - startTimeArrayListRemoveFirstElement;
        long timeRemoveLinkedListFirstElement = endTimeLinkedListRemoveFirstElement - startTimeLinkedListRemoveFirstElement;
        System.out.println("\n Время удаления первого элемента в Array list:" + timeRemoveArrayListFirstElement);
        System.out.println("Время удаления первого элемента в Linked list:" + timeRemoveLinkedListFirstElement);

        // GET LAST in ArrayList
        long startTimeArrayListRemoveLastElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++) al.get(al.size()-1);
        long endTimeArrayListRemoveLastElement = System.currentTimeMillis();
        // GET LAST in LinkedList
        long startTimeLinkedListRemoveLastElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)ll.get(al.size()-1);
        long endTimeLinkedListRemoveLastElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeRemoveArrayListLastElement = endTimeArrayListRemoveLastElement - startTimeArrayListRemoveLastElement;
        long timeRemoveLinkedListLastElement = endTimeLinkedListRemoveLastElement - startTimeLinkedListRemoveLastElement;
        System.out.println("\n Время удаления последнего  в Array list:" + timeRemoveArrayListLastElement);
        System.out.println("Время удаления последнего в Linked list:" + timeRemoveLinkedListLastElement);

        // GET MIDDLE in ArrayList
        long startTimeArrayListRemoveMiddleElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)al.add(al.size()/2+j);
        long endTimeArrayListRemoveMiddleElement = System.currentTimeMillis();
        // GET MIDDLE in  LinkedList
        long startTimeLinkedListRemoveMiddleElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)ll.add(al.size()/2+j);
        long endTimeLinkedListRemoveMiddleElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeRemoveArrayListMiddleElement = endTimeArrayListRemoveMiddleElement - startTimeArrayListRemoveMiddleElement;
        long timeRemoveLinkedListMiddleElement = endTimeLinkedListRemoveMiddleElement - startTimeLinkedListRemoveMiddleElement;
        System.out.println("\n Время удаления элемента из середины Array list:" + timeRemoveArrayListMiddleElement);
        System.out.println("Время удаления  из середины Linked list:" + timeRemoveLinkedListMiddleElement);
    }




    public void compareMapsPut(HashMap hashMap, TreeMap treeMap) {
        long startTimeHashMapPutElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)hashMap.put("диагноз неизученный" + j, "лекарство не найдено " + j);
        long endTimeHashMapPutElement = System.currentTimeMillis();
        // GET MIDDLE in  LinkedList
        long startTimeTreeMapPutElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)treeMap.put("преступление тяжкое" + j, "мера наказания непердсказуемая" + j);
        long endTimeTreeMapPutElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeRemoveHashMapElement = endTimeHashMapPutElement - startTimeHashMapPutElement;
        long timeRemoveTreeMapPutElement = endTimeTreeMapPutElement - startTimeTreeMapPutElement;
        System.out.println("\n Время добавления элемента в HashMap:" + timeRemoveHashMapElement);
        System.out.println("Время добавления элемента в TreeMap:" + timeRemoveTreeMapPutElement);


    }
    public void compareMapsGet(HashMap hashMap, TreeMap treeMap) {
        long startTimeHashMapGetElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)hashMap.get ("диагноз неизученный" + j);
        long endTimeHashMapGetElement = System.currentTimeMillis();
        // GET MIDDLE in  LinkedList
        long startTimeTreeMapGetElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)treeMap.get("преступление тяжкое" + j);
        long endTimeTreeMapGetElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeHashMapGetElement = endTimeHashMapGetElement - startTimeHashMapGetElement;
        long timeTreeMapGetElement = endTimeTreeMapGetElement - startTimeTreeMapGetElement;
        System.out.println("\n Время получения элемента из HashMap:" + timeHashMapGetElement);
        System.out.println("Время получения элемента из TreeMap:" + timeTreeMapGetElement);
    }
    public void compareMapsRemove(HashMap hashMap, TreeMap treeMap) {
        long startTimeHashMapRemoveElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)hashMap.remove ("диагноз неизученный" + j);
        long endTimeHashMapRemoveElement = System.currentTimeMillis();
        // GET MIDDLE in  LinkedList
        long startTimeTreeMapRemoveElement = System.currentTimeMillis();
        for(int j = 0; j < 10000; j++)treeMap.remove("преступление тяжкое" + j);
        long endTimeTreeMapRemoveElement = System.currentTimeMillis();
        // TIME RESULTS
        long timeHashMapRemoveElement = endTimeHashMapRemoveElement - startTimeHashMapRemoveElement;
        long timeTreeMapRemoveElement = endTimeTreeMapRemoveElement - startTimeTreeMapRemoveElement;
        System.out.println("\n Время удаления элемента из HashMap:" + timeHashMapRemoveElement);
        System.out.println("Время удаления элемента из TreeMap:" + timeTreeMapRemoveElement);
    }
}





