package com.shailendra.javaeightfeatures.features;

interface IAdd {

    public int add(int a , int b);
    //public int minus(int a );
}


public class LambdaExpression {


    public static void main(String[] args) {
        // Lambda expression to add two numbers
        IAdd ab = (a, b) -> a + b ;

        ab.add(1, 2);


        Runnable r = () ->{
            System.out.println("value " + ab.add(1,2));

        };

       r.run();

    }





}
