class Restaurant {
    void bill(int quantity, double price) {
        System.out.println("Total bill: Rs." + (quantity * price));
    }

    void bill(String itemName, int quantity, double price) {
        System.out.println("Item: " + itemName + ", Quantity: " + quantity + ", Total: Rs:" + (quantity * price));
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.bill(2, 55);
        r.bill("Burger", 3, 32.0);
    }
}
