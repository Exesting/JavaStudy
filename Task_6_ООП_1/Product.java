public class Product {
	public static int totalProducts = 0;
	private final String storeName = "Супермаркет 'У дома'";
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;

	public Product() {
		this("name", 69.99, "category", true, 900);
	}

	public Product(String name, double price, String category) {
		this(name, price, category, false, 34);
	}

	public Product(String name, double price, String category, boolean inStock, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.inStock = inStock;
		this.quantity = quantity;
		totalProducts++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		if (0<price<=1_000_000) {
			this.price = price;
		}
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public void setQuantity(int quantity) {
		if (quantity>0) {
			this.quantity = quantity;
		}
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public boolean getInStock() {
		return inStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public static double calculateTotalValue(Product[] product){
	    double total = 0;
	    for (int i = 0; i < product.length(); i++){
	        total += product[i].getPrice();
	    }
	    return total;
	}

	public String displayInfo(boolean showStockStatus) {
		if (showStockStatus == true) {
			return name + "\n" + price + "\n" + category + "\n" + inStock + "\n" + quantity;
		} else if (showStockStatus == false) {
			return name + "\n" + price + "\n" + category;
		}
	}

	public void applyDiscount(double percent, String promoCode) {
		double skidka = (percent*price)/100;
		if (price - skidka >= 0) {
			price -= skidka;
			System.out.println("Вот ваш промокод: " + promoCode);
		} else {
			System.out.println("Цена отрицательна");
		}
	}

	public void restock(int amount, String supplier) {
		quantity += amount;
		System.out.println("Имя поставщика: " + supplier);
	}

	public void sell(int amount, String customer) {
		if (quantity - amount >= 0) {
			quantity -= amount;
			System.out.println("Имя покупателя: " + customer);
		} else {
			System.out.println("Товара недостаточно");
		}
	}
}