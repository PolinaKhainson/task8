package com.java.courses.tasks.task8.task8_1;


import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArrayListWithOverridingMethods extends ArrayList {
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        ArrayList e = (ArrayList) o;
        if (e.size() != this.size()) {
            return false;
        }
        for (int i = 0; i < e.size(); i++) {
        Integer arrayList = (Integer)e.get(i);
        Integer arrayListWithOverridingMethods = (Integer)this.get(i);
            if ( arrayList.intValue() != arrayListWithOverridingMethods.intValue()) {
                break;
            } else if (i < e.size()-1){
                continue;
            } else  {
                System.out.println("Arrays are equal");
                return true;
            }
        }
        System.out.println("Arrays are not equal");
        return false;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.size();
        result = prime * result + this.size();
        result = prime * result + this.size();
        return result;
    }


}
