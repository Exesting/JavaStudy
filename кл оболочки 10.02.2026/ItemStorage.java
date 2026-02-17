public class ItemStorage<T> {
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void compareWith(T otherValue) {
		if (value.equals(null) || otherValue.equals(null)) {
			System.out.println("Опачки! Ревизия невозможна, объект не найден");
			return;
		}

		if (otherValue.equals(value)) {
			System.out.println("Значения идентичны. Контроль качества пройден");
		}
	}
}