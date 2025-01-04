package SealedClass;

public sealed abstract class Shape permits Circle, Rectangle  {
    public abstract double area();

    public abstract double perimeter();

}

