package org.example;

public class JavaOperators {

    // Unary postfix
    int increment (int i) {
        return ++i;
    }


    // Arithmatic +-*

    int add (int a, int b) {

        return a+b;
    }

    int sub (int a, int b) {

        return a-b;
    }
    int mul(int a, int b) {

        return a*b;
    }

    int div(int a, int b) {

        return a/b;
    }


    // Logical

    boolean logicalAnd(boolean b1, boolean b2) {
        return b1 && b2;
    }

    boolean logicalOr (boolean b1, boolean b2) {
        return b1 || b2;
    }


    // Ternary condition ? return_when_true: return_when_false
    String infoAboutNumber (int i) {

        return i>= 10 ? "The value is greater or equal 10" : "The value is less the 10";
    }


    //Relational instanceof ==, !=, >=,<=
    boolean isString (Object o) {
        return o instanceof String;

    }

        boolean isEqual (int i, int y) {
        return (i == y);
    }

    boolean isNotEqual (int x, int y) {
        return (x != y);
    }

    boolean isLessOrEqualTo (int x, int y) {
        return (x <= y);
    }

    boolean isGreaterOrEqualTo (int x, int y) {
        return (x >= y);
    }

}
