import java.util.Scanner;
public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int c=1, i, temp;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        for (i=1; i<=p; i++){
            temp=n;
            c=c*temp;
        }
        System.out.println("result: "+ c);

    }
}
