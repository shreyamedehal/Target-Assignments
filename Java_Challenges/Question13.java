import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String arr[] = str.split("");
        int count=0;
        for(String ch : arr){
            count++;
        }
        System.out.println("count: "+ count);
    }
}
