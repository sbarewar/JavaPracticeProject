package com.shailendra.javaeightfeatures.features.FunctionalInterface.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> nonSortList = Arrays.asList(20, 4, 78, 23, 133, 45, 67, 54, 3);

        List<String> strList = Arrays.asList("flipkart", "amazon", "alibaba", "ebay", "misho", "ajio");

        //Filter

        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);


        //Map
        list.stream().map(x -> x * x).forEach(System.out::println);

        //Sort
        nonSortList.stream().sorted().forEach(System.out::println);

        //Collect
        List<String> startWithA = strList.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(startWithA);

        //Count
        Long val = list.stream().count();
        int va = list.size();

        System.out.println(val);

        //reduce
        Integer sum = nonSortList.stream().reduce(0, (a , b)-> a + b);



        System.out.println(sum);



    }
}
