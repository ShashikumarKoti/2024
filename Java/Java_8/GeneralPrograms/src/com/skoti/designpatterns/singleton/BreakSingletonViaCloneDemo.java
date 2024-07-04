package com.skoti.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonViaCloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        //break singleton via cloning
//        BreakSingletonViaClone instance1 = BreakSingletonViaClone.getInstance();
//        System.out.println(instance1.hashCode());
//
//        BreakSingletonViaClone clonedInstance = (BreakSingletonViaClone) instance1.clone();
//        System.out.println(clonedInstance.hashCode());

        //break singleton via reflection
//        BreakSingletonViaClone breakSingletonViaClone1 = BreakSingletonViaClone.getInstance();
//        System.out.println(breakSingletonViaClone1.hashCode());
//
//        BreakSingletonViaClone breakSingletonViaClone2 = null;
//        Constructor[] declaredConstructors = BreakSingletonViaClone.class.getDeclaredConstructors();
//        for (Constructor constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            breakSingletonViaClone2 = (BreakSingletonViaClone) constructor.newInstance();
//        }
//        System.out.println(breakSingletonViaClone2.hashCode());


        //break singleton using deserialization
        BreakSingletonViaClone breakSingletonViaClone1 = BreakSingletonViaClone.getInstance();
        //Serialize
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.txt"));
        objectOutputStream.writeObject(breakSingletonViaClone1);
        objectOutputStream.close();
        System.out.println(breakSingletonViaClone1.hashCode());

        //Deserialize
        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("test.txt"));
        BreakSingletonViaClone breakSingletonViaClone2 = (BreakSingletonViaClone) objectInput.readObject();
        objectInput.close();

        System.out.println(breakSingletonViaClone2.hashCode());


    }
}
