package com.skoti.overriding.exceptions;

//Note: If the superclass method declares an exception, then the overriding subclass method can declare the same exception,
// subclass exception or no exception, but it cannot declare a parent exception thrown by the superclass method.
//Case 1:
//public class Parent {
//
//    public void m1() throws  Exception{
//
//    }
//}
//
//class Child extends Parent {
//
//    @Override
//    public void m1() {
//
//    }
//}

import java.io.IOException;

//Case 2:
//public class Parent {
//
//    public void m1() {
//
//    }
//}
//
//class Child extends Parent {
//
//    @Override
//    public void m1() throws Exception{
//
//    }
//}
//
//import java.io.IOException;
//
////Case 3:
public class Parent {

    public void m1() throws Exception{

    }
}

class Child extends Parent {

    @Override
    public void m1() throws IOException {

    }
}