package com.shailendra.javaeightfeatures.features.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> print = () -> "Hello";

        print.get();
         System.out.println(print.get());



    }

//

//            | Interface | Takes Input | Returns Output |
//            | --------- | ----------- | -------------- |
//            | Predicate | Yes         | Boolean        |
//            | Function  | Yes         | Yes            |
//            | Consumer  | Yes         | No             |
//            | Supplier  | No          | Yes            |

}
