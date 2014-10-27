package com.java.courses.tasks.utils.test;

import com.java.courses.tasks.task8.task8_1.ArrayListWithOverridingMethods;
import java.util.ArrayList;


public class TestArrayListWithOverridingMethods {
    public static void main(String[] args) {
        int arrayLength = 1000;
        // Создаем коллекции List
        ArrayList arrayList = new ArrayList();
        ArrayListWithOverridingMethods arrayListOverriddenMethods = new ArrayListWithOverridingMethods();
        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(i);
            arrayListOverriddenMethods.add(i);
        }
        // equals: Сравнение двух массивов ArrayList по переопределенному equals()
        System.out.println(arrayListOverriddenMethods);
        System.out.println(arrayList);
        arrayListOverriddenMethods.equals(arrayList);

        // hashCode: Нахождение хеш-кода ArrayList по переопределенному hashCode()
        ArrayListWithOverridingMethods arrayListOverriddenMethods1 = new ArrayListWithOverridingMethods();// еще одна коллекция с переопределенным методом hashCode() для наглядности
        for (int i = 0; i < 5454; i++) {
           arrayListOverriddenMethods1.add(i);
        }
        System.out.println(arrayListOverriddenMethods.hashCode());
        System.out.println(arrayListOverriddenMethods1.hashCode());

    }
}
