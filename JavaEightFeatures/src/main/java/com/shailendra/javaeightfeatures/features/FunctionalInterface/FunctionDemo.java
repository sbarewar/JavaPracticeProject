package com.shailendra.javaeightfeatures.features.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> in = x -> x + 1;
        Function<Integer, Integer> square = num -> num * num;
        System.out.println(square.apply(5));

        Function<Integer, Integer> squareAfterComp = square.compose(in);
        System.out.println(squareAfterComp.apply(5));

        Function<Integer, Integer> incAfterSquare = square.andThen(in);
        System.out.println(incAfterSquare.apply(5));

        Function<String, String> id = Function.identity();
        System.out.println(id.apply("hello"));


        Function<String, Integer> length = String::length;
        Function<Integer, Integer> doubleIt = n -> n * 2;

        // get length then double it
        Function<String, Integer> lenThenDouble = length.andThen(doubleIt).andThen(square);
        System.out.println(lenThenDouble.apply("abc")); // length 3 -> 6

    }
}
