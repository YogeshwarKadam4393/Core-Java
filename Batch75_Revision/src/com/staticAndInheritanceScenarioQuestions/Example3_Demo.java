package com.staticAndInheritanceScenarioQuestions;

public class Example3_Demo {

    // show() method returns the current class object.
    public Example3_Demo show() {

        // 'this' refers to the current object.
        return this;
    }

    public static void main(String[] args) {

        // Creating an object of Example3_Demo class.
        Example3_Demo d = new Example3_Demo();

        // d.show() returns the same object whose reference is stored in d.
        // Therefore, both references point to the same object.
        // '==' compares object references, not object contents.
        System.out.println(d.show() == d);
    }
}
