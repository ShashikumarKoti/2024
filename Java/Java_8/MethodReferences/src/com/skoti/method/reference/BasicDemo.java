package com.skoti.method.reference;

public class BasicDemo {
  public void m1() {
    System.out.println("m1 instance method called");
  }

  public static void m2() {
    System.out.println("m2 static method called");
  }

  public static void main(String[] args) {
    // legacy
    BasicDemo.m2();
    BasicDemo basicDemo = new BasicDemo();
    basicDemo.m1();

    //method reference can be used in lambda/streams
    //syntax :  reference::methodName
    /*
    3 types
      1. static method reference
      2. instance method reference
      3. constructor reference
            syntax:
                reference :: constructor

     */
 //   BasicDemo::m2;  //static method reference

//    basicDemo::m1;  //instance method reference

  }
}
