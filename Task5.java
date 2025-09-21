import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int res = 0;
        for (int i = 1; i<=n; i++) {
            s*=i;
            res+=s;
            System.out.println(res);
        }
    }
}