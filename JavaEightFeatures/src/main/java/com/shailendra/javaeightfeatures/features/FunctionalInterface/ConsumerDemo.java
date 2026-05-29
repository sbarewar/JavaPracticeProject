package com.shailendra.javaeightfeatures.features.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {


        Consumer<String> consume = (x) -> {
            System.out.println("Consumer " + x);
        };


        consume.accept("shailendra");

         Consumer<Integer> printSquare = x -> System.out.println(x * x);
         printSquare.accept(5);
         printSquare.andThen(x -> System.out.println(x * 2)).accept(5);


         Consumer<Long>  printMinus = z -> System.out.println(z - 2);

         printMinus.accept(20L);
         printMinus.andThen(z -> System.out.println(z-3)).accept(34L);
    }





}
