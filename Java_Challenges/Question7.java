import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[50];
        int sum=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Avg : " + sum/n);

    }
}
