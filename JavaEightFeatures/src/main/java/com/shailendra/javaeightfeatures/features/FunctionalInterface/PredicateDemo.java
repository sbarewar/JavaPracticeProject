package com.shailendra.javaeightfeatures.features.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEven =  num -> num % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
        System.out.println(isEven.test(9));


        Predicate<String> isEmpty = val -> val == "";


    }

}
