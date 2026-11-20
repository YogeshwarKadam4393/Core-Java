package com.mainMethodAndAccessModifiers;

// =====================================================
// 1. INVALID: Protected Top-Level Class
// =====================================================

// protected class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// ERROR: modifier protected not allowed here


// =====================================================
// 2. INVALID: Private Top-Level Class
// =====================================================

// private class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// ERROR: modifier private not allowed here


// =====================================================
// 3. VALID: Default Access Modifier
// =====================================================

// class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 4. VALID: Public Top-Level Class
// =====================================================

// public class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello
// NOTE: Public class name must match the Java file name.


// =====================================================
// 5. VALID: Abstract Top-Level Class
// =====================================================

// abstract class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello
// NOTE: Abstract class cannot be instantiated directly.
// But it can contain a static main() method.


// =====================================================
// 6. VALID: Final Top-Level Class
// =====================================================

// final class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello
// NOTE: Final class cannot be inherited.


// =====================================================
// 7. INVALID: Final + Abstract Together
// =====================================================

// final abstract class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// ERROR: illegal combination of modifiers: abstract and final
// REASON: Abstract class requires inheritance to implement it,
// whereas final class cannot be inherited.


// =====================================================
// 8. INVALID: Static Top-Level Class
// =====================================================

// static class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// ERROR: modifier static not allowed here
// REASON: Static modifier is not allowed for top-level classes.


// =====================================================
// 9. VALID: Static Nested Class
// =====================================================

// class Outer {
//
//     static class Inner {
//
//         public static void main(String[] args) {
//
//             System.out.println("Hello from Inner Class");
//
//         }
//
//     }
//
// }

// OUTPUT: Hello from Inner Class
// COMMAND: java 'Outer$Inner'
// NOTE: Static is allowed for nested classes.


// =====================================================
// 10. VALID: Protected Nested Class
// =====================================================

// public class TestingAccessModifierAtClassLevel {
//
//     protected class InnerClass1 {
//
//     }
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 11. VALID: Private Nested Class
// =====================================================

// public class TestingAccessModifierAtClassLevel {
//
//     private class InnerClass2 {
//
//     }
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 12. VALID: Public Nested Class
// =====================================================

// public class TestingAccessModifierAtClassLevel {
//
//     public class InnerClass3 {
//
//     }
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 13. VALID: Abstract + Static Nested Class
// =====================================================

// class Outer {
//
//     static abstract class Inner {
//
//         abstract void display();
//
//     }
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 14. INVALID: New Keyword at Class Declaration
// =====================================================

// new class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// ERROR: Syntax error
// REASON: new keyword is used for object creation,
// not for class declaration.


// =====================================================
// 15. VALID: Final + Public Together
// =====================================================

// public final class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 16. VALID: Abstract + Public Together
// =====================================================

// public abstract class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello


// =====================================================
// 17. INVALID: Private + Protected Together
// =====================================================

// private protected class TestingAccessModifierAtClassLevel {
//
// }

// ERROR: modifier private not allowed here
// REASON: Top-level classes cannot use private or protected.


// =====================================================
// 18. VALID: Strictfp Top-Level Class (Java 8)
// =====================================================

// strictfp class TestingAccessModifierAtClassLevel {
//
//     public static void main(String[] args) {
//
//         System.out.println("Hello");
//
//     }
//
// }

// OUTPUT: Hello
// NOTE: strictfp is redundant from Java 17 onwards.


// =====================================================
// ACTUAL EXECUTABLE CLASS
// =====================================================

public class TestingAccessModifierAtClassLevel {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }

}

// OUTPUT: Hello Java
