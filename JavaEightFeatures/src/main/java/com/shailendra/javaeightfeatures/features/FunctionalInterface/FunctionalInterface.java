package com.shailendra.javaeightfeatures.features.FunctionalInterface;

@java.lang.FunctionalInterface
interface Display {
    void show();
    default void display() {
        System.out.println("display method");
    }


}

interface Print {

    abstract void print();
    default void showMe() {
        System.out.println("show me method");
    }



}

public class FunctionalInterface {

    public static void main(String[]  args) {
        Display di = () -> {
            System.out.println("display show method");
        };

        di.show();
        di.display();

        System.out.println("======print display method=======");

        Print p = () -> {
            System.out.println("print  method");
        };

        p.print();
        p.showMe();

    }

}


