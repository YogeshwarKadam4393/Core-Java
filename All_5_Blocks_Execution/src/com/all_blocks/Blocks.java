package com.all_blocks;

/* There Are 5 Important Blocks In Java:

1 --> Static Variable
2 --> Static Block
3 --> Instance (Non-static) Variable
4 --> Instance Initializer Block (Non-static Block)
5 --> Constructor
6 --> Main Method (Entry point)*/

//*******************************************************************

/* Execution Order : At Class Loading----->
  
1 -→ Static Variables
2 -→ Static Block(s)
3 -→ Main Method
4 -→ Object Creation (new)
5 -→ Instance Variables (Non Static Variables)
6 -→ Non-static Block(s)
7 -→ Constructor
8 -→ Methods (when called)

*/


public class Blocks {

    // 1. Static Variable
    static int a = initializeStaticVariable();

    // 2. Static Block
    static {
        System.out.println("2. Static Block");
    }

    // 3. Instance Variable
    int b = initializeInstanceVariable();

    // 4. Non-Static Block (Instance Initializer)
    {
        System.out.println("5. Non-Static Block");
    }

    // Constructor
    Blocks() {
        System.out.println("6. Constructor");
    }

    // Static Variable Initialization Method
    static int initializeStaticVariable() {
        System.out.println("1. Static Variable Initialization");
        return 100;
    }

    // Instance Variable Initialization Method
    int initializeInstanceVariable() {
        System.out.println("4. Instance Variable Initialization");
        return 200;
    }

    void display() {
        System.out.println("7. Display Method");
    }

    public static void main(String[] args) {

        System.out.println("3. Main Method Starts");

        Blocks obj1 = new Blocks();

        obj1.display();

        System.out.println("----------------");

        Blocks obj2 = new Blocks();

        obj2.display();
    }
}
