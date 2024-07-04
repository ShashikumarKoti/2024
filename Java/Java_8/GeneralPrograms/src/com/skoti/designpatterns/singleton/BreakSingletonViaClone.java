package com.skoti.designpatterns.singleton;

import java.io.Serializable;

public class BreakSingletonViaClone extends MyClone implements Serializable {

    private static BreakSingletonViaClone instance;

    //prevent from reflection
    private BreakSingletonViaClone() {
        if (instance != null) {
            throw new IllegalStateException("Object cant be created using reflection");
        }
    }

    public static synchronized BreakSingletonViaClone getInstance() {
        if (instance == null) {
            return instance = new BreakSingletonViaClone();
        }
        return instance;
    }

    //prevent from cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //prevent from deserialization
    protected Object readResolve() {
        return instance;
    }
}
