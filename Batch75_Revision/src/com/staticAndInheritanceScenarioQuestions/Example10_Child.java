package com.staticAndInheritanceScenarioQuestions;

public class Example10_Child extends Example10_Parent {

    // Step 5: Instance variable initialization happens after
    // the Parent constructor completes.
    int x = 20;

    @Override
    void show() {

        // Step 4: Child's overridden method executes.
        // At this moment x has its default value 0.
        System.out.println(x);

    }

    Example10_Child() {

        // Step 2: Calls Parent class constructor.
        super();

        // Step 6: Child constructor body executes.
    }

    public static void main(String[] args) {

        // Step 1: Child object creation starts.
    	
//      Output ---> 0 Because Child Variables Initialize After Parent Constructor  	
        new Example10_Child();

    }
}
