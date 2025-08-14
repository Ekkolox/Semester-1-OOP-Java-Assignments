package assignments;

public class App {

	public static void main(String[] args) {
		// Create products
        Product product1 = new Product("Laptop", 1000.00, 1);
        Product product2 = new Product("Headphones", 50.00, 2);
        Product product3 = new Product("Smartphone", 600.00, 1);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Calculate total
        cart.calculateTotal();

        // Remove a product from cart
        cart.removeProduct(product2);

        // Calculate total again
        cart.calculateTotal();

	}

}
