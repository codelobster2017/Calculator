package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, "54", 44, "3,25", "5.375", 66, 5.0f));
        ArrayList arrayList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 0.002));
        Calculator calculator = new Calculator();
        System.out.println(calculator.binary(arrayList));
        System.out.println(calculator.sum(arrayList2));
        System.out.println(calculator.multiplying(arrayList2));
        System.out.println(calculator.divide(arrayList2));
    }
}