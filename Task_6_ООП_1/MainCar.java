public class MainCar {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("lada", "granta", 1899);
		Car car2 = new Car("volga", "42", 2000, "black", 40000, true, 40);
		car1.startEngine();
		car.stopEngine();
		car2.drive(61);
		car1.repaint("green");
		car2.updatePrice(4444);
		car1.newYear(2007);
		System.out.println("\n" + car.displayInfo());
		System.out.println("\n" + car1.displayInfo());
		System.out.println("\n" + car2.displayInfo());
	}
}