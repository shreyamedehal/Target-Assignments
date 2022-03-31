import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev =0;
        int digit, rem;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        while(rev>0){
            digit = rev%10;
            switch (digit){
                case 1: System.out.print("One ");
                    break;
                case 2: System.out.print("Two ");
                    break;
                case 3: System.out.print("Three ");
                    break;
                case 4: System.out.print("Four ");
                    break;
                case 5: System.out.print("Five ");
                    break;
                case 6: System.out.print("Six ");
                    break;
                case 7: System.out.print("Seven ");
                    break;
                case 8: System.out.print("Eight ");
                    break;
                case 9: System.out.print("Nine ");
                    break;
                case 0: System.out.print("Zero ");
                    break;
                default: System.out.print("Something went wrong!!");
                    break;
            }
            rev = rev/10;
        }

    }

}
