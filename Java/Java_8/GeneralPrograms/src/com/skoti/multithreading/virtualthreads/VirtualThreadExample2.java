package com.skoti.multithreading.virtualthreads;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample2 {

    public static void main(String[] args) {

        List<Thread> virtualThreadsList = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            int vThreadIndex = i;
            Thread vThread = Thread.ofVirtual().start(
                    () -> {
                        int result = 1;
                        for (int j = 0; j < 10; j++) {
                            result *= (j + 1);
                        }
                        System.out.println("Result[" + vThreadIndex + "]: " + result);
                    }
            );
            virtualThreadsList.add(vThread);
        }

        for (Thread thread : virtualThreadsList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
