import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String x = sc.nextLine().toLowerCase();
        char y[] = x.toCharArray();
        int size = x.length();
        System.out.println("enter the character to delete: ");
        char d = sc.next().charAt(0);
        d= Character.toLowerCase(d);
        int i=0;
        String res ="";
        while(i!=size){
            if(y[i] != d)
                res = res + y[i];
            i++;
        }
        System.out.println(res);
    }
}
