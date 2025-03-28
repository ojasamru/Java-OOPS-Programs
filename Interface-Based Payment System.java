interface Payment {
    void makePayment(double amount);
}

class CreditCardPayment implements Payment {
    
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPI_Payment implements Payment {
    
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPI_Payment();

        creditCard.makePayment(500);
        upi.makePayment(250);
    }
}
