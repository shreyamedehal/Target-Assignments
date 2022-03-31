import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int x, y, i, j;
        System.out.println("Enter the lower bound: ");
        x = sc.nextInt();
        System.out.println("Enter the upper bound: ");
        y = sc.nextInt();
        System.out.printf("Prime numbers between %d and %d are: ", x, y);
        for (i = x; i <= y; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.print(j + " ");
        }
    }
}
