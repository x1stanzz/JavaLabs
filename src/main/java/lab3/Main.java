package lab3;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product product1 = new Product(1, "Cheese", 50.0);
        Product product2 = new Product(2, "Cereal", 80.0);
        Product product3 = new Product(3, "Tea", 100.00);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println("Cart before changes: ");
        cart.showCart();
        System.out.println("\n");

        cart.removeProduct(product1);
        cart.removeProduct(product3);

        System.out.println("Cart after changes: ");
        cart.showCart();
        System.out.println("\n");

        Order order = new Order(1, cart.getCart());
        order.placeOrder();
        System.out.println("Status: " + order.getStatus());
    }
}
