public class Main {
	public static void main(String[] args) {
		// Сценарий А:
		ItemStorage<Integer> a = new ItemStorage<>();
		a.setValue(100);
		a.compareWith(100);

		// Сценарий Б:
		ItemStorage<Integer> b = new ItemStorage<>();
		b.setValue(200);
		b.compareWith(200);

		//Сценарий В:
		ItemStorage<Fraction> c1 = new ItemStorage<>();
		ItemStorage<Fraction> c2 = new ItemStorage<>();
		c1.setValue(new Fraction(1, 2));
		c2.setValue(new Fraction(1, 2));
		if (c1.getValue().equals(c2.getValue())) {
			System.out.println("Значения идентичны. Контроль качества пройден");
		}
	}
}