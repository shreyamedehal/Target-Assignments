import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sr = (int)Math.sqrt(num);
        if(sr*sr == num){
            System.out.println(num + " is a perfect square");
        }
        else{
            System.out.println(num + " is not a perfect square");
        }

    }
}
