import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int res = 0;
        for (int i = 1; i<=(2*n); i++) {
            res+=n*s;
            s*=2;
            System.out.println(res);
        }
    }
}