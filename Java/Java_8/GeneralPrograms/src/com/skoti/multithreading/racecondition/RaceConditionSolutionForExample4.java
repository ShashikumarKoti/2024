package com.skoti.multithreading.racecondition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RaceConditionSolutionForExample4 {
    public static void main(String[] args) {

        Map<String, String> sharedMap = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(getRunnable(sharedMap));
        Thread thread2 = new Thread(getRunnable(sharedMap));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Map<String, String> sharedMap) {

        return () -> {
            for (int i = 0; i < 100000; i++) {
                synchronized (sharedMap) {
                    if (sharedMap.containsKey("key")) {
                        String key = sharedMap.remove("key");
                        if (key == null) {
                            System.out.println("Iteration " + i + " value for key is null");
                        }
                    } else {
                        sharedMap.put("key", "value");
                    }
                }

            }
        };
    }
}


