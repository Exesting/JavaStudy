import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float x = scanner.nextFloat();
        float k = 1;
        float d = 0;
        float res = 0;
        for (int i = 1; i<=n; i++) {
            k*=i;
            d=x*k;
            res+=k*d;
            System.out.println(res);
        }
    }
}