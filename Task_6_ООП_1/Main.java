public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		Product product1 = new Product("apple", 15, "fruit");
		Product product2 = new Product("cucumber", 100, "vegetable", true, 60);
		product2.applyDiscount(50.0);
		product.restock(5);
		product1.sell(14);
		System.out.println("\n" + product.displayInfo());
		System.out.println("\n" + product1.displayInfo());
		System.out.println("\n" + product2.displayInfo());
	}
}