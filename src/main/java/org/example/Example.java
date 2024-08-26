package org.example;

public class Example {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount += 1;
    }

    public void incrementInstanceCount() {
        this.instanceCount += 1;
    }

    @Override
    public String toString() {
        return "totalCount: " + totalCount + ", instanceCount " + this.instanceCount;
    }
}
