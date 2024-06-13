package com.skoti.pkg2;

import com.skoti.pkg1.Child2;
import com.skoti.pkg1.Parent2;

public class Test2 {

    public static void main(String[] args) {

        Parent2 parent2 = new Child2();
        ((Child2) parent2).m2(); //compile error if not casted
    }
}
