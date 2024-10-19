import java.util.Scanner;

public class Java_Loops_ii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (1 << j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
