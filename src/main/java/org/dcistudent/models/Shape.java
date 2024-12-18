package org.dcistudent.models;

public abstract sealed class Shape permits Circle, Rectangle {
    public abstract Double area();
    public abstract Double perimeter();
}
