import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the string:");
        String str = sc.nextLine().toUpperCase();
        System.out.println(str);
    }
}
