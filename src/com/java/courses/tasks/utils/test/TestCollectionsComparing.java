package com.java.courses.tasks.utils.test;
import com.java.courses.tasks.task8.task8_1.ArrayListWithOverridingMethods;
import com.java.courses.tasks.task8.task8_1.CollectionsComparing;

import java.util.*;

public class TestCollectionsComparing {
    public static void main(String[] args) {
        int arrayLength = 1000;
        // Создаем коллекции List
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
            for (int i = 0; i < arrayLength; i++) {
                arrayList.add(i);
                linkedList.add(i);
             }

        // Коллекции List - сравнение по производительности
        new CollectionsComparing().compareListsAdd(arrayList, linkedList);
        new CollectionsComparing().compareListsGet(arrayList, linkedList);
        new CollectionsComparing().compareListsRemove(arrayList, linkedList);

        // Создаем массивы Map
        HashMap hashMap = new HashMap<String, String>();
        TreeMap treeMap = new TreeMap<String, String>();
            for(int i = 0; i < arrayLength; i++) {
             hashMap.put("диагноз" + i, "лекарство" + i);
             treeMap.put("преступление" + i, "мера наказания" + i);
             }
        //Ассоциативные массивы Map - сравнение по производительности
        new CollectionsComparing().compareMapsPut(hashMap, treeMap);
        new CollectionsComparing().compareMapsGet(hashMap, treeMap);
        new CollectionsComparing().compareMapsRemove(hashMap, treeMap);
    }
}
