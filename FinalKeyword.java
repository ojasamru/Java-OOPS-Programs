
final class Security {
    void showWarning() {
        System.out.println("Unauthorized access is prohibited!");
    }
}


public class FinalEx {
    public static void main(String[] args) {
        Security sec = new Security();
        sec.showWarning();
    }
}