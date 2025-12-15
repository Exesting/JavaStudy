import java.util.Scanner;

public class MainBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();
		Book book1 = new Book("Oleg Satia", "Popa", 2021);
		Book book2 = new Book("ALeksei Zhadnov", "Vonuchie potnie Iaiza", 2024, true, 1000);

		System.out.println("\n" + book2.displayInfoFirst());
		System.out.println("");

		System.out.println("Если берете книгу, введите свое имя. Если не берете, напишите 'false'");
		String n = scanner.nextLine();

		if (!n.equals("false")) {
			book2.borrowBook(n);
			System.out.println("\n" + book2.displayInfo());
			System.out.println("");
			System.out.println("Хотите изменить информацию о книге? (true/false)");
			String a = scanner.nextLine();
			if ((!n.equals("false")) && (!a.equals("false"))) {
				System.out.println("Введи имя автора:");
				book2.setAuthor(scanner.nextLine());
				
				System.out.println("Введи название:");
				book2.setTitle(scanner.nextLine());

				System.out.println("Введи год:");
				book2.setYear(scanner.nextInt());

				System.out.println("Введи кол-во страниц:");
				book2.setPageCount(scanner.nextInt());

				System.out.println("\n" + book2.displayInfo());
			} else {
				System.out.println("Хорошего чтения!");
			}
		} else {
			System.out.println("Пока");
		}
	}
}