import  java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum=0;
        int evenSum=0;

        for(int i=1; i<=n; i++){
            if(i%2!=0)
                oddSum += i;
        }
        System.out.println("Odd sum = "+ oddSum);

        for(int i=0; i<=n; i++){
            if(i%2==0)
                evenSum += i;
        }
        System.out.println("Even sum = "+ evenSum);

    }
}
