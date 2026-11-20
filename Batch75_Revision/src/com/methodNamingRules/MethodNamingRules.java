package com.methodNamingRules;

public class MethodNamingRules {

    // =====================================================
    // 1. VALID: Method name can start with an uppercase letter.
    // =====================================================

    public void Display() {

        System.out.println("Uppercase First Letter");

    }


    // =====================================================
    // 2. VALID: Method name can start with a lowercase letter.
    // RECOMMENDED: Follow camelCase convention.
    // =====================================================

    public void display() {

        System.out.println("Lowercase First Letter");

    }


    // =====================================================
    // 3. VALID: Method name can start with underscore (_).
    // =====================================================

    public void _display() {

        System.out.println("Underscore Method");

    }


    // =====================================================
    // 4. VALID: Method name can start with dollar ($).
    // =====================================================

    public void $display() {

        System.out.println("Dollar Method");

    }


    // =====================================================
    // 5. INVALID: Method name cannot start with a number.
    // =====================================================

    /*
    public void 123display() {

        System.out.println("Invalid Method");

    }
    */


    // =====================================================
    // 6. VALID: Numbers are allowed after the first character.
    // =====================================================

    public void display123() {

        System.out.println("Numbers After First Character");

    }


    // =====================================================
    // 7. INVALID: Spaces are not allowed in method names.
    // =====================================================

    /*
    public void display data() {

        System.out.println("Invalid Method");

    }
    */


    // =====================================================
    // 8. INVALID: Special characters are not allowed.
    // =====================================================

    /*
    public void display@data() { }  // Invalid

    public void display#data() { }  // Invalid

    public void display%data() { }  // Invalid
    */


    // =====================================================
    // 9. VALID: Java is case-sensitive.
    // These are three different method names.
    // =====================================================

    public void test() {

        System.out.println("Lowercase");

    }

    public void Test() {

        System.out.println("First Letter Uppercase");

    }

    public void TEST() {

        System.out.println("All Uppercase");

    }


    // =====================================================
    // 10. INVALID: Java keywords cannot be method names.
    // =====================================================

    /*
    public void class() { }   // Invalid

    public void static() { }  // Invalid

    public void return() { }  // Invalid

    public void public() { }  // Invalid
    */


    // =====================================================
    // 11. VALID: Unicode characters are allowed.
    // =====================================================

    public void नमस्ते() {

        System.out.println("Unicode Method");

    }


    // =====================================================
    // 12. VALID: Method Overloading.
    // Same method name with different parameters.
    // =====================================================

    public void calculate() {

        System.out.println("No Arguments");

    }

    public void calculate(int a) {

        System.out.println("One Argument");

    }

    public void calculate(int a, int b) {

        System.out.println("Two Arguments");

    }


    // =====================================================
    // 13. INVALID: Same method name and same parameters.
    // Return type alone cannot differentiate methods.
    // =====================================================

    /*
    public void show() { }

    public int show() {

        return 10;

    }
    */


    // =====================================================
    // 14. VALID: Underscore can also appear between words.
    // =====================================================

    public void display_employee_details() {

        System.out.println("Underscore Between Words");

    }


    // =====================================================
    // 15. VALID: Dollar can also appear between words.
    // =====================================================

    public void display$employee() {

        System.out.println("Dollar Between Words");

    }


    // =====================================================
    // 16. VALID: Method can have a return statement.
    // =====================================================

    public void m1() {

        return;

    }


    // =====================================================
    // 17. VALID: Void method can return without a value.
    // =====================================================

    public void m2() {

        System.out.println("Void Method");

        return;

    }


    // =====================================================
    // 18. INVALID: Void method cannot return a value.
    // =====================================================

    /*
    public void m3() {

        return 10;

    }
    */


    // =====================================================
    // 19. VALID: Method name can contain multiple words.
    // RECOMMENDED: Use camelCase.
    // =====================================================

    public void calculateEmployeeSalary() {

        System.out.println("Employee Salary");

    }


    // =====================================================
    // 20. VALID: Boolean methods commonly use is/has prefixes.
    // =====================================================

    public boolean isActive() {

        return true;

    }

    public boolean hasPermission() {

        return false;

    }


    // =====================================================
    // MAIN METHOD
    // =====================================================

    public static void main(String[] args) {

        MethodNamingRules obj = new MethodNamingRules();

        obj.Display();

        obj.display();

        obj._display();

        obj.$display();

        obj.display123();

        obj.test();

        obj.Test();

        obj.TEST();

        obj.नमस्ते();

        obj.calculate();

        obj.calculate(10);

        obj.calculate(10, 20);

        obj.display_employee_details();

        obj.display$employee();

        obj.m1();

        obj.m2();

        obj.calculateEmployeeSalary();

        System.out.println(obj.isActive());

        System.out.println(obj.hasPermission());

    }

}
