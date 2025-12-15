import java.util.Scanner;

public class  TextAnalyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("Почты:  " + findEmails(str));
        System.out.println("Даты: " + findDates(str));
        System.out.println("Имена:  " + findCapitalizedWords(str));
        System.out.println("Количество цифр: " + countDigits(str));
	}
	public static String findEmails(String text) {
		String[] mass = split(text);
		String stroka = "\n";
		int k = 1;
		for (int i = 0;i<mass.length;i++) {
			if (mass[i].matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.—]+[a-zA-Z]{2,}")){
				stroka += k + ". " + mass[i] + "\n";
				k++;
			}
		}
		return stroka;
	}
	public static String findDates(String text) {
		String[] mass = split(text);
		String stroka = "\n";
		int k = 1;
		for (int i = 0;i<mass.length;i++) {
			if (mass[i].matches("(([0][1-9])|([1-2][0-9])|([3][0-1]))[.]([1-9]|[1][0-2])[.](([1][9][0-9][0-9])|([2][0][0-9][0-9]))")){
				stroka += k + ". " + mass[i] + "\n";
				k++;
			}
		}
		return stroka;
	}
	public static String findCapitalizedWords(String text) {
		String[] mass = split(text);
		String stroka = "\n";
		int k = 1;
		for (int i = 0;i<mass.length;i++) {
			if (mass[i].matches("[A-Z][a-z]*|[А-Я][а-я]*|[A-Z][a-z]*[—][a-z]*|[А-Я][а-я]*[—][а-я]*")){
				stroka += k + ". " + mass[i] + "\n";
				k++;
			}
		}
		return stroka;
	}
	public static int countDigits(String text) {
		int count = 0;
        for (int i = 0; i < text.length(); i++){
            String ch = text.charAt(i) + "";
            if (ch.matches("[0-9]")) {
            	count++;
            }
        }
        return count;
	}
	public static String delete(String str) {
		String strnew = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ',' && str.charAt(i) != '"' && str.charAt(i) != ']' && str.charAt(i) != '[' && str.charAt(i) != '!' && str.charAt(i) != ':' && str.charAt(i) != ';'){
                strnew += str.charAt(i);
            }
        }
        return strnew;
	}
	public static int quantity(String str) {
		int k = 1;
		for (int i = 0; i<str.length();i++){
			if (str.charAt(i)== ' '){
				k++;
			}
		}
		return k;
	}
	public static String[] split(String a) {
		String str = delete(a);
		String[] mass = new String[quantity(str)];
		String word = "";
		int cnt = 0;
		for (int i = 0;i<str.length();i++){
			if (str.charAt(i) != ' '){
				word+=str.charAt(i);
			} else {
				mass[cnt]=word;
				word="";
				cnt++;
			} if (i==str.length()-1){
				mass[cnt]=word;
			}
		}
		return mass;
	}
}