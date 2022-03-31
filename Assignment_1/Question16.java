//1, 5, 13, 29, 49, 77 .............. N
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int ans = 1;
        for(int i=1; i<n; i++){
            if(i%3!=0){
                System.out.print(ans + ", ");
                ans = ans + (4*i);
            }
        }
    }
}
