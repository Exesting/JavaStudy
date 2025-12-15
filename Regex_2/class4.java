import java.util.regex.*;

public class class4 {
	public static void main(String[] args) {
		String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
		Pattern pat = Pattern.compile("[A-Za-zА-Яа-я0-9,]+;?");
		Matcher mat = pat.matcher(csv);
		while (mat.find()) {
			System.out.println(mat.group());
		}
	}
}