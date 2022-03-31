import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int i=0, d=0;
        while(temp>0){
            int rem = temp%10;
            temp /= 10;
            d = d + rem*(int)Math.pow(2,i++);

        }
        System.out.println("Decimal value is "+d);
    }
}
