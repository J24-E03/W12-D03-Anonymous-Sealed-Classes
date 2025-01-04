package AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
//        Create a reference to AnonymousClass.Shape
        Shape shape1 = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing the shape!");
            }
        };
        //and assign the anonymous class to it
        shape1.draw();
    }
}
