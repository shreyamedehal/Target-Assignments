//1, 4, 9, 25, 36, 49 ..................N
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int ans=0;
        for(int i=1; i<n; i++){
            if(i%4!=0){
                ans = i*i;
                System.out.print(ans + ", ");
            }
        }

    }
}
