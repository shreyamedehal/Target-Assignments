import java.util.Scanner;

public class Question7 {
    static void largest(int num1, int num2, int num3){
       if(num1>num2 && num1>num3)
           System.out.println("largest: " + num1);
       else if(num2>num1 && num2>num3)
           System.out.println("largest: " + num2);
       else
           System.out.println("largest: " + num3);

    }

    static void secondLargest(int num1, int num2, int num3){
        if(num1>num2 && num1<num3 || num1>num3 && num1<num2)
            System.out.println("second largest: "+ num1);
        else if(num2>num1 && num2<num3 || num2>num3 && num2<num1)
            System.out.println("second largest: "+ num2);
        else
            System.out.println("second largest: "+ num3);
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        largest(a,b,c);
        secondLargest(a,b,c);
    }
}
