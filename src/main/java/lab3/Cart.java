package lab3;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cart = new ArrayList<Product>();

    public void addProduct(Product product){
        cart.add(product);
    }

    public void removeProduct(Product product){
        cart.remove(product);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void showCart(){
        for(Product product : cart){
            System.out.println("Id: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("-------------------------------");
        }
    }
}
