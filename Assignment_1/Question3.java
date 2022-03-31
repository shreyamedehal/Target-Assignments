import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter the principal amount, time and rate: ");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float t = sc.nextFloat();
        float r = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Simple Interest is: " +si);
    }
}
