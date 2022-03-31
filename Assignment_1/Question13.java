import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();

//        1, 4, 27, 256, 3125 .............. N
        for(int i=1,j=1; i<n; i++,j++){
            System.out.print((int)Math.pow(i,j) + " ");
        }
        System.out.println();
    }
}
