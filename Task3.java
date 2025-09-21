import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int res = 0;
        for (int i = 1; i<=n; i++) {
            res+=n*s;
            s*=n;
            System.out.println(res);
        }
    }
}