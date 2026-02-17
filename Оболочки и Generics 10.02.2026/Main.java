public class Main {
	public static void main(String[] args) {
		// Сценарий А:
		ItemStorage<Integer> a = new ItemStorage<>();
		a.setValue(100); // Кэширование, следовательно a(100) сравнение 100 это один и тот же объект при сравнении == будет выводить true и при .equals тоже true
		a.compareWith(100);

		// Сценарий Б:
		ItemStorage<Integer> b = new ItemStorage<>();
		b.setValue(200); // Тут уже кэширования нет, поэтому значения больше чем 127, являются отдельными объектами, при .equals будет true, при == false
		b.compareWith(200);

		//Сценарий В:
		ItemStorage<Fraction> c1 = new ItemStorage<>();
		ItemStorage<Fraction> c2 = new ItemStorage<>();
		c1.setValue(new Fraction(1, 2));
		c2.setValue(new Fraction(1, 2)); //тут либо с иквалс, либо с компейрвис, но с переопределенным через обджектс иквалс, а обджектс мы не прошли
		if (c1.getValue().equals(c2.getValue())) {
			System.out.println("Значения идентичны. Контроль качества пройден");
		}
	}

}
