package AnonymousClass;

public class AnonymousClass1 extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            void speak() {
                System.out.println("Dog is Barking!");
        }

        };
        animal.speak();
    }

}
