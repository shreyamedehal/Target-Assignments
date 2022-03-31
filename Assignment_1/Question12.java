import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();

//        -1, 2, -3, 4, -5........N
        for(int i=1; i<n; i++){
            if(i%2!=0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
