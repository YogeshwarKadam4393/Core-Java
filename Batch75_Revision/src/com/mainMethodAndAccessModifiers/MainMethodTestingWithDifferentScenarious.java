package com.mainMethodAndAccessModifiers;

public class MainMethodTestingWithDifferentScenarious {

    // 1. VALID: Position of access modifiers and keywords does not matter.

    /*
    static public void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 2. VALID: final keyword can be used with static main method.
    // final prevents method hiding in a subclass.

    /*
    final static public void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 3. INVALID AS TRADITIONAL JVM ENTRY POINT: Removing static keyword.
    // Instance methods require an object to be called.

    /*
    final public void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 4. INVALID AS JVM ENTRY POINT: Changing the method name.
    // JVM expects the method name to be main.

    /*
    final static public void customizedMethodName(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 5. INVALID AS TRADITIONAL JVM ENTRY POINT: Changing return type.
    // The traditional main method must have void return type.

    /*
    public static int main(String[] args) {

        return 10;

    }
    */


    // 6. INVALID AS TRADITIONAL JVM ENTRY POINT: Changing parameter type.
    // JVM expects String[] or equivalent String... parameter.

    /*
    public static void main(int[] args) {

        System.out.println("Hello Java");

    }
    */


    // 7. VALID: String... is equivalent to String[].
    // Varargs can be used instead of an array.

    /*
    public static void main(String... args) {

        System.out.println("Hello Java");

    }
    */


    // 8. VALID: Parameter variable name can be changed.
    // args is not a fixed keyword.

    /*
    public static void main(String[] values) {

        System.out.println("Hello Java");

    }
    */


    // 9. INVALID IN JAVA 8: Removing public modifier.
    // Traditional JVM entry point requires public access.

    /*
    static void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 10. INVALID IN JAVA 8: Using private modifier.
    // Traditional JVM entry point must be public.

    /*
    private static void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 11. VALID: Main method supports method overloading.
    // JVM calls main(String[] args).
    // Other overloaded methods must be called explicitly.

    /*
    public static void main(String[] args) {

        System.out.println("String Array Main");

        main(10);

    }

    public static void main(int number) {

        System.out.println("Integer Main");

    }
    */


    // 12. VALID: Multiple main methods with different parameters.
    // This is called Method Overloading.

    /*
    public static void main(String[] args) {

        System.out.println("Main Method 1");

    }

    public static void main(String args) {

        System.out.println("Main Method 2");

    }
    */


    // 13. VALID: main method can be overloaded with different data types.

    /*
    public static void main(String[] args) {

        System.out.println("String Array Main");

        main(10.5);

    }

    public static void main(double number) {

        System.out.println("Double Main: " + number);

    }
    */


    // 14. VALID: main method can be declared as synchronized.
    // synchronized controls access to the method through its monitor.

    /*
    public static synchronized void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // 15. VALID: main method can be declared as strictfp in Java 8.
    // strictfp ensures consistent floating-point calculations.
    // Note: strictfp is redundant from Java 17 onwards.

    /*
    public static strictfp void main(String[] args) {

        System.out.println("Hello Java");

    }
    */


    // ACTUAL MAIN METHOD: Standard entry point for Java 8.

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }

}
/*
 * 
 * ### Important Notes
 * 
 * 1. 'static' allows JVM to invoke the main method without creating an object.
 * 2. 'final' prevents method overriding/hiding. 
 * 3. 'String[] args' and 'String... args' are both valid. 
 * 4. Main method supports method overloading.
 * 5. Parameter variable names can be changed. 
 * 6. Changing the method name or return type does not satisfy the traditional entry-point signature. 
 * 7. Java 8 requires `public static void main(String[] args)` as the standard entry point. 
 * 8. Java 25 introduced flexible main method declarations, so some traditional restrictions have changed.
 */