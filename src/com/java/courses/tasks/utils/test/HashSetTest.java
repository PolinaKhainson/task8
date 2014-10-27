package com.java.courses.tasks.utils.test;

import java.util.Iterator;
import com.java.courses.tasks.task8.task8_3.HashSet;

public class HashSetTest {
        public static void main(String[] args)  {
            HashSet names = new HashSet(50);
            names.add("Harry");
            names.add("Sue");
            names.add("Nina");
            System.out.println(names.size() + " " + names.getlength());

            names.add("Susannah");
            System.out.println(names.size() + " " + names.getlength());
            System.out.println();

            names.add("Larry");
            names.add("Juliet");
            names.add("Kate");
            names.add("Romeo");
            names.add("Maria");
            System.out.println(names.size() + " " + names.getlength());

            names.add("Ann");
            names.add("Bobby");
            System.out.println(names.size() + " " + names.getlength());
            names.add("Sue");
            names.add("Sue");
            names.add("Sue");
            names.add("Sue");
            names.add("Sue");
            System.out.println(names.size() + " " + names.getlength());

        }
    }

