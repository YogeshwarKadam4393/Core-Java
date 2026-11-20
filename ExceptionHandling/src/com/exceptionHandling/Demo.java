package com.exceptionHandling;

public class Demo {

    public static void main(String[] args) {

        try (MyResource resource = new MyResource()) {  // Resourses will get AutoClosed Using Autocloseable or closeable

            resource.use();

        } catch (Exception e) {

            System.out.println("Exception occurred");
        }
    }
}
