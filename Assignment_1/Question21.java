//1, -2, 6, -15, 31, -56 .............. N
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int ans =1;
        for(int i=0; i<=n; i++){
            if(i%2!=0){
                ans  = ans+ i*i;
                System.out.print(-ans +" ");
            }
            else{
                ans  = ans+ i*i;
                System.out.print(ans +" ");
            }
        }
    }
}
