import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String str = sc.nextLine();
        int len = str.length();
        String rev ="";
        for(int i= len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
