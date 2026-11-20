package com.staticAndInheritanceScenarioQuestions;

public class Example10_Parent {

    Example10_Parent() {

        // Step 3: Parent constructor gets executed.
        // It calls show() method.
        // Since the actual object is Example10_Child,
        // the overridden show() method of Child class executes.
        this.show();

    }

    void show() {

        // This method executes only if Parent implementation is selected.
        System.out.println("Parent");

    }
}
