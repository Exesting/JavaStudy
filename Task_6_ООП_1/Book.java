import java.util.Scanner;

public class Book {
	private static int totalBooks = 0;
	private final int maxYear = 2025;
	private static Scanner scanner = new Scanner(System.in);
	private String title;
	private String author;
	private int year;
	private boolean isAvailable;
	private int pageCount;

	public Book() {
		this("Mein Kampf", "Adolf Hitler", 1925, false, 2000);
	}

	public Book(String title, String author, int year) {
		this(title, author, year, false, 500);
	}

	public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
		this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pageCount = pageCount;
        totalBooks++;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTitle(String title) {
		while (title == null || title == "") {
			System.out.println("Название неверное");
			title = scanner.nextLine();
		}
		this.title = title;
	}

	public void setAuthor(String author) {
		while (author == null || author == "") {
			System.out.println("Имя неверное");
			author = scanner.nextLine();
		}
		this.author = author;
	}

	public void setYear(int year) {
		while (year < 1 || year > 2024) {
			System.out.println("Год неверный");
			year = scanner.nextInt();
		}
		this.year = year;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setPageCount(int pageCount) {
		while (pageCount < 0) {
			System.out.println("Количество неверно");
			pageCount = scanner.nextInt();
		}
		this.pageCount = pageCount;
	}

	public String displayInfo() {
		System.out.println("Вывести полную/неполную информацию? (true/false)");
		boolean n = scanner.nextBoolean();
		if (n == true) {
			System.out.println("==ИНФОРМАЦИЯ О КНИГЕ==");
			return title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
		} else {
			System.out.println("==ИНФОРМАЦИЯ О КНИГЕ==");
			return title + "\n" + author + "\n" + year;
		}	
	}

	public String displayInfoFirst() {
		System.out.println("==ИНФОРМАЦИЯ О КНИГЕ==");
		return title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;	
	}

	public void borrowBook(String borrowerName) {
		isAvailable = false;
		System.out.println(borrowerName);
	}

	public void returnBook() {
		setIsAvailable(true);
	}

	public void updateYear(int newYear) {
		setYear(newYear);
	}
}