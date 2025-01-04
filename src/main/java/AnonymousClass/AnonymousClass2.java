package AnonymousClass;

public class AnonymousClass2 {
    public static void main(String[] args) {
        //perform addition
        Calculator addition = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;

            }
        };
        // Anonymous class for multiplication
        Calculator multiplication = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        int num1 = 3;
        int num2 = 2;
        int additionResult = addition.calculate(num1,num2);

        System.out.println("Addition Result : " + additionResult);

        int multiplicationResult = multiplication.calculate(num1,num2);
        System.out.println("Multiplication Result : " + multiplicationResult);


    }
}
