import java.util.regex.*;

public class class5 {
	public static void main(String[] args) {
		String post = "Сегодня был в #парке и #кино #отдых #выходные";
		Pattern pat = Pattern.compile("\\#[A-Za-zА-Яа-я0-9,]+");
		Matcher mat = pat.matcher(post);
		while (mat.find()) {
			System.out.println(mat.group());
		}
	}
}