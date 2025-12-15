import java.util.Scanner;

public class MainBankAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount account = new BankAccount();
		BankAccount account1 = new BankAccount("register25", "Vova");
		BankAccount account2 = new BankAccount("register47", "Anna", 25.1, "dollar", true);

		System.out.println("\n" + account2.displayInfoFirst());
		System.out.println("");

		System.out.println("Хотите изменить информацию об аккаунте? (true/false)");
		String a = scanner.nextLine();

		if (a.equals("true")) {
			System.out.println("Введи номер аккаунта:");
			account2.setAccountNumber(scanner.nextLine());
			System.out.println("");
				
			System.out.println("Введи имя владельца:");
			account2.setOwnerName(scanner.nextLine());
			System.out.println("");

			System.out.println("Введи кол-во денег на счету:");
			account2.setBalance(scanner.nextDouble());
			scanner.nextLine();
			System.out.println("");

			System.out.println("Хотите снять или положить деньги? (если да, напишите 'true', иначе 'false')");
			String j = scanner.nextLine();
			System.out.println("");

			if ((j.equals("true")) && (a.equals("true"))) {
				System.out.println("Снять/положить? (true/false)");
				String n = scanner.nextLine();
				System.out.println("");
				if ((n.equals("true")) && (j.equals("true")) && (a.equals("true"))) {
					System.out.println("Сколько снять?");
					account2.setWithdraw(scanner.nextDouble(), "Счет обновлен");
					scanner.nextLine();
					System.out.println("");
				} else if ((n.equals("false")) && (j.equals("true")) && (a.equals("true"))) {
					System.out.println("Сколько положить?");
					account2.setDeposit(scanner.nextDouble(), "Счет обновлен");
					scanner.nextLine();
					System.out.println("");
				}
			} else if ((j.equals("false")) && (a.equals("true"))) {
				System.out.println("");
			}

			System.out.println("Введи валюту:");
			account2.setCurrency(scanner.nextLine());
			System.out.println("");

			System.out.println("Активировать/деактивировать аккаунт? (true/false)");
			account2.setActivateAccount(scanner.nextBoolean());
			System.out.println("");

			System.out.println("\n" + account2.displayInfo());
		} else if (a.equals("false")) {
			System.out.println("Пока");
		}
	}
}