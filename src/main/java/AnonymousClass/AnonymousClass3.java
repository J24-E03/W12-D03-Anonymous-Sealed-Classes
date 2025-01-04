package AnonymousClass;

public class AnonymousClass3 {
    public static void main(String[] args) {
        UserValidation adminValidation = new UserValidation(){


            @Override
            public boolean validate(String username, String password) {
            // validate an admin user with username "admin" and password "admin123"
                return username.equals("admin") && password.equals("admin123");
            }
        };
        System.out.print("Username: %s, Password : %s");

        UserValidation guestValidation = new UserValidation() {
            @Override
            public boolean validate(String username, String password) {
                // validate an guest user with username "guest" and password "guest123"
                return username.equals("guest") && password.equals("guest123");
            }
        };
        System.out.printf("Username: %s, Password: %s, Login: %b%n", " admin", " admin123",adminValidation.validate("admin","admin123"));
        System.out.printf("Username: %s, Password: %s, Login: %b%n", "guest", "guest123",guestValidation.validate("guest","guest123"));
    }
}
