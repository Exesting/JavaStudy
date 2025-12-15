import java.util.Scanner;

public class BankAccount {
	public static Scanner scanner = new Scanner(System.in);
	private final String bankName = "Национальный банк";
	private static int totalAccounts = 0;
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;

	public BankAccount() {
		this("accountNumber", "ownerName", 2567.13, "currency", true);
	}

	public BankAccount(String accountNumber, String ownerName) {
		this(accountNumber, ownerName, 25.99, "rybli", false);
	}

	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
		totalAccounts++;
	}

	public static double stepen(double chislo, int stepen) {
		double res = chislo;
		for (int i = 0; i <= stepen; i++) {
			res *= chislo;
		}
		return res;
	}

	public static double calculateInterest(double amount, double rate, int years) {
		return amount * stepen((1 + rate/100), years);
	}

	public void setDeposit(double amount, String desciption) {
		while ((balance+amount) > 1_000_000_000  || amount < 0) {
			System.out.println("Баланс неверный");
			amount = scanner.nextInt();
		}
		balance+=amount;
		System.out.println(desciption);
	}

	public void setWithdraw(double amount, String purpose) {
		while ((balance-amount) < 0 || amount < 0) {
			System.out.println("Баланс неверный");
			amount = scanner.nextInt();
		}
		balance-=amount;
		System.out.println(purpose);
	}

	public void setActivateAccount(boolean isActive) {
		this.isActive = isActive;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setAccountNumber(String accountNumber) {
		while (accountNumber == null || accountNumber == "") {
			System.out.println("Номер аккаунта");
			accountNumber = scanner.nextLine();
		}
		this.accountNumber = accountNumber;
	}

	public void setOwnerName(String ownerName) {
		while (ownerName == null || ownerName == "") {
			System.out.println("Имя неверное");
			ownerName = scanner.nextLine();
		}
		this.ownerName = ownerName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String displayInfo() {
		System.out.println("Вывести полную/неполную информацию? (true/false)");
		boolean n = scanner.nextBoolean();
		if (n == true) {
			System.out.println("==НОВАЯ ИНФОРМАЦИЯ ОБ АККАУНТЕ==");
			return accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
		} else {
			System.out.println("==НОВАЯ ИНФОРМАЦИЯ ОБ АККАУНТЕ==");
			return accountNumber + "\n" + ownerName + "\n" + balance;
		}
	}

	public String displayInfoFirst() {
		System.out.println("==ИНФОРМАЦИЯ ОБ АККАУНТЕ==");
		return accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
	}

	public double getDeposit() {
		return balance;
	}

	public double getWithdraw() {
		return balance;
	}

	public boolean getActivateAccount() {
		return isActive;
	}

	public String getCurrency() {
		return currency;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}
}