package assignments;

import java.util.ArrayList;

public class Product {
	private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}

class ShoppingCart {
    private ArrayList<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(Product product) {
        cart.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    public void calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getTotalPrice();
        }
        System.out.println("Total bill: " + total);
    }
}



