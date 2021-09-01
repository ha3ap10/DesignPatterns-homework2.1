package ru.netology;

import ru.netology.adapter.Ints;
import ru.netology.adapter.IntsCalculator;

public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.sub(2, 10));
        System.out.println(intsCalc.mult(2, 10));
        System.out.println(intsCalc.div(10, 2));
        System.out.println(intsCalc.pow(2, 5));
    }
}
