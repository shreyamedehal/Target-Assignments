import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int N = sc.nextInt();
        int ans=0;

        while(N>0){
            int rem = N%10;
            N /= 10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }

}
