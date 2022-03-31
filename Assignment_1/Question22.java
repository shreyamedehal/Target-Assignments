//1, 1, 2, 3, 5, 8, 13 ........... N
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int a=0, b=1,c;
        for(int i=1; i<=n; i++){
            System.out.print(b + " ");
            c= a+b;
            a=b;
            b=c;

        }
    }
}

