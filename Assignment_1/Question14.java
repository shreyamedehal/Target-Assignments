//1, 4, 7, 12, 23 ................ N
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int num[] = new int[100];
        num[0]= 1;
        num[1]= 4;
        num[2]= 7;
        for(int i=0; i<n; i++){
            num[i+3]  =num[i+2] + num[i+1] + num[i];
            System.out.print(num[i]+" ");
        }


    }
}
