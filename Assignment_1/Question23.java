//1, -2, 4, -6, 7, -10, 10, -14 ..............N
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int ans =2;
        int ans1 =1;
        for(int i=0; i<=n; i++){
            if(i%2!=0){
                System.out.print(-ans + " ");
                ans = ans + 4;
            }
            else{
                System.out.print(ans1 +" ");
                ans1 = ans1 +3;
            }
        }

    }
}
