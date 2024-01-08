package lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCart {
    private Cart cart;
    private Order order;
    private Product product1, product2, product3;
    @BeforeEach
    public void generateCart(){
        cart = new Cart();
        product1 = new Product(1, "Milk", 40.0);
        product2 = new Product(2, "Bread", 15.0);
        product3 = new Product(3, "Eggs", 50.0);
        order = new Order(1, cart.getCart());
    }

    //Test adding products
    @Test
    public void testAddProductToCart(){
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        Assertions.assertEquals(3, cart.getCart().size());
    }

    //Test removing products
    @Test
    public void testRemoveProductFromCart(){
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.removeProduct(product2);

        Assertions.assertEquals(2, cart.getCart().size());
    }

    //Test getting order and placing order
    @Test
    public void testPlaceOrder(){
        Assertions.assertEquals("Pending", order.getStatus());
        Cart mockedCart = mock(Cart.class);
        when(mockedCart.getCart()).thenReturn(new ArrayList<>(Arrays.asList(product1, product2, product3)));

        Order order = new Order(1, mockedCart.getCart());
        order.placeOrder();

        Assertions.assertEquals("Placed", order.getStatus());
    }
}
