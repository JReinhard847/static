package org.example;

public class Main {
    public static void main(String[] args) {
        Example ex1 = new Example();
        Example ex2 = new Example();
        Example ex3 = new Example();

        System.out.println(ex1);
        ex1.incrementInstanceCount();
        System.out.println(ex1);
        System.out.println(ex2);
        Example.incrementTotalCount();
        System.out.println(ex1);
        System.out.println(ex3);
    }
}