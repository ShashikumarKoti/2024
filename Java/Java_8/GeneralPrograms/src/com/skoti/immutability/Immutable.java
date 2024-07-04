package com.skoti.immutability;

import java.util.HashMap;
import java.util.Map;

public final class Immutable {

    private final String name;
    private final int regNum;
    private final Map<String, String> metadata;

    public Immutable(String name, int regNum, Map<String, String> metadata) {
        this.name = name;
        this.regNum = regNum;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNum() {
        return regNum;
    }

    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
