import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();

//        4, 16, 36, 64.......N
        for(int i=2; i<n; i=i+2){
            System.out.print((int)Math.pow(i,2) + " ");
        }
        System.out.println();
    }
}

