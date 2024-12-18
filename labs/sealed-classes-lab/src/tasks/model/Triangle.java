package tasks.model;

public class Triangle extends Shape {
    // The Triangle class cannot extend Shape, because Shape is a sealed class and does not permit Triangle to extend it.
    // In the class declaration, only classes declared after the "permits" keyword are allowed to extend the Shape class.
}
