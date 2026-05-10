package com.shailendra.collectionfreamwork.Collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public void demonstrateStack() {
        System.out.println("=========================StackDemo=======================");

        Stack<String> stack = new Stack<String>();
        //1 add
        stack.push("mobile");
        stack.push("wechat");
        stack.push("apple");
        stack.push("iphone");
        stack.push("android");
        stack.push("ios");
        stack.push("android");
        stack.push("flutter");

        //2 print
        for(String item : stack) {
            System.out.println(item);
        }

        //3 Peak element
        System.out.println("peak Element " + stack.peek());

        //4 pop element
        System.out.println("pop element " + stack.pop());

        //5 Search Element
        System.out.println("Search element  "+ stack.search("apple"));

        //6 check Empty
        System.out.println("Check Empty " + stack.empty());

        //7 iterator
        Iterator<String> it = stack.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //8 size
        System.out.println("stack size " + stack.size());

        //9 clear
        stack.clear();
        System.out.println("is Empty " + stack.isEmpty());

    }

}
