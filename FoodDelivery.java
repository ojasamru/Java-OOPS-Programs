abstract class FoodOrder {
    abstract void placeOrder();
    abstract void cancelOrder();

    void orderConfirmation() {
        System.out.println("Your order has been confirmed!");
    }
}

class PizzaOrder extends FoodOrder {
    void placeOrder() {
        System.out.println("Pizza order placed successfully.");
    }

    void cancelOrder() {
        System.out.println("Pizza order has been canceled.");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        FoodOrder myOrder = new PizzaOrder();
        myOrder.placeOrder();
        myOrder.orderConfirmation();
        myOrder.cancelOrder();
    }
}