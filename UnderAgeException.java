class UnderAgeException extends Exception {
    UnderAgeException(String message) {
        super(message);
    }
}

public class LicenseCheck {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18)
                throw new UnderAgeException("You must be 18+ to apply for a driving license.");
            else
                System.out.println("Eligible for driving license!");
        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}