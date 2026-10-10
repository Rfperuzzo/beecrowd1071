
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, x, y, impar = 0, m;

        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > y) {
            m = x;
            x = y;
            y = m;
        }

        for (i = x + 1; i < y; i = i + 1) {
            if (i % 2 != 0) {
                impar = impar + i;
            }
        }
        System.out.println(impar);

    }
}
