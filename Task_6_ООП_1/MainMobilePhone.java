import java.util.Scanner;

public class MainMobilePhone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MobilePhone phone = new MobilePhone();
		MobilePhone phone1 = new MobilePhone("pendosia", "13a", 32);
		MobilePhone phone2 = new MobilePhone("android", "16s", 1024, 40, true);

		System.out.println("\n" + phone2.displayInfoFirst());
		System.out.println("");

		System.out.println("Хотите изменить информацию о телефоне? (true/false)");
		String a = scanner.nextLine();
		System.out.println("");

		if (a.equals("true")) {
			System.out.println("Введи бренд:");
			phone2.setBrand(scanner.nextLine());
			System.out.println("");
				
			System.out.println("Введи модель:");
			phone2.setModel(scanner.nextLine());
			System.out.println("");

			System.out.println("Введи кол-во GB:");
			phone2.setStorageGB(scanner.nextInt());
			System.out.println("");


			System.out.println("Введи кол-во заряда:");
			phone2.setBatteryLevel(scanner.nextInt());
			scanner.nextLine();
			System.out.println("");

			System.out.println("Изменить заряд да/нет? (true/false)");
			String n = scanner.nextLine();
			if (n.equals("true")) {
				System.out.println("Если зарядить, напишите 'true', иначе 'false'");
				String b = scanner.nextLine();
				System.out.println("");
				if (b.equals("true")) {
					System.out.println("На сколько зарядить?");
					int c = scanner.nextInt();
					System.out.println("");
					System.out.println("Сколько минут телефон будет заряжаться?");
					int e = scanner.nextInt();
					System.out.println("");
					phone2.setChargeBattery(c, e);
					System.out.println("");
				} else if (b.equals("false")) {
					System.out.println("На сколько разрядить?");
					int d = scanner.nextInt();
					scanner.nextLine();
					System.out.println("");
					System.out.println("Какое приложение использует заряд?");
					String f = scanner.nextLine();
					System.out.println("");
					phone2.setUseBattery(d, f);
					System.out.println("");
				}
			} else if (n.equals("false")) {
				System.out.println("");
			}

			System.out.println("Включен ли телефон? (true/false)");
			phone2.setPower(scanner.nextBoolean());
			System.out.println("");
			
			System.out.println("\n" + phone2.displayInfo());
		} else if (a.equals("false")) {
			System.out.println("Пока");
		}
	}
}