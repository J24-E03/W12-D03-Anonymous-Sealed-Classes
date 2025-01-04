# Lab Exercise: Understanding Sealed Classes in Java

## Objective:
- To understand and practice using **sealed classes** in Java.
- To learn how to restrict which classes can extend or implement a particular class or interface using the `sealed`, `non-sealed`, and `permits` keywords.

---

## Background:
Sealed classes, introduced in Java 15, allow you to control which classes or interfaces can extend or implement them. This helps in designing more predictable and controlled class hierarchies.

In a sealed class:
- You specify which subclasses can extend it by using the `permits` keyword.
- You restrict inheritance to only the listed classes.
- You can use the `non-sealed` keyword to allow a subclass to be further extended.

---

## Part 1: Sealing a Class and Restricting Inheritance

#### Task:
1. Create a **sealed class** `AnonymousClass.Shape` with two methods: `area()` and `perimeter()`, both returning `double`.
2. Use the `permits` keyword to allow only the classes `Circle` and `Rectangle` to extend `AnonymousClass.Shape`.
3. Create the `Circle` class with a constructor that takes the radius and implements `area()` and `perimeter()` methods.
4. Create the `Rectangle` class with a constructor that takes width and height and implements `area()` and `perimeter()` methods.
5. Create a main method to test the classes by creating objects of `Circle` and `Rectangle`, and printing the area and perimeter.

---

## Part 2: Using `non-sealed` Classes

#### Task:
1. Modify the `Rectangle` class from Part 1 by adding the `non-sealed` keyword.
2. Create a new class `Square` that extends `Rectangle` and implements its own constructor and methods.
3. In the `Square` class, override the `area()` and `perimeter()` methods to properly compute the area and perimeter for a square.
4. Test the `Square` class in the `main()` method by creating a `Square` object and printing its area and perimeter.

---

## Part 3: Using Sealed Interfaces

#### Task:
1. Create a **sealed interface** `Account` with a method `getBalance()`.
2. Use the `permits` keyword to allow only the classes `CheckingAccount` and `SavingsAccount` to implement `Account`.
3. Create the `CheckingAccount` class with a constructor to initialize balance and implement the `getBalance()` method.
4. Create the `SavingsAccount` class with a constructor to initialize balance and implement the `getBalance()` method.
5. Test the implementation in the `main()` method by creating objects of both `CheckingAccount` and `SavingsAccount` and printing their balances.

---

## Part 4: Understanding the Restrictions of Sealed Classes

#### Task:
1. Attempt to create a class `Triangle` that extends `AnonymousClass.Shape` from Part 1.
2. Explain why this class cannot be created and what the restriction is with respect to sealed classes.
3. Create another class `LoanAccount` that tries to implement the `Account` interface from Part 3. 
4. Again, explain the restriction regarding `sealed` interfaces and why `LoanAccount` is not allowed.
