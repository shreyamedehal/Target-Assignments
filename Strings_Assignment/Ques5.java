import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x = sc.nextLine();
        char y[] = x.toCharArray();
        int len =0;
        for(char v : y){
            len++;
        }
        System.out.println(len);
    }
}
