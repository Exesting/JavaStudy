import java.util.Scanner;

public class Car {
	
	private static Scanner scanner = new Scanner(System.in);
	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;

	public Car() {
		this("brand", "model", 2000, "color", 1800.0, true, 5050.50);
	}

	public Car(String brand, String model, int year) {
		this(brand, model, year, "red", 9000.0, false, 1010.10);
	}

	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
	}


	public void setYear(int newYear) {
		boolean flag = false;
		while (newYear > 1885 || newYear < 2025) {
			System.out.println("Введи нормальный год...");
			newYear = scanner.nextInt();
		}
		year = newYear;
	}

	public String displayInfo() {
		return brand + "\n" + model + "\n" + year + "\n" + color + "\n" + price + "\n" + isRunning + "\n" + mileage;
	}

	public void startEngine() {
		isRunning = true;
	}

	public void stopEngine() {
		isRunning = false;
	}

	public void drive(double distance) {
		mileage += distance;
	}

	public void repaint(String newColor) {
		color = newColor;
	}

	public void updatePrice(double newPrice) {
		price = newPrice;
	}
}