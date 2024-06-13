package com.skoti.overriding.exceptions;


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

import java.io.IOException;

//Case 3:
public class Parent {

    public void m1() throws Exception{

    }
}

class Child extends Parent {

    @Override
    public void m1() throws IOException {

    }
}