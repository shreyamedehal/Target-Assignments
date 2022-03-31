import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        int num,i=0;
        int[] binary = new int[10];
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        while(num!=0){
            binary[i]= num%2;
            num /=2;
            i++;
        }
        System.out.println("The binary value is: ");
        for(int j=i-1; j>=0; j--){
            System.out.print(" "+ binary[j]);
        }
    }
}
