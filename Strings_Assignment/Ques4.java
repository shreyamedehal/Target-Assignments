import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        if(str.equals("")){
            System.out.println("string is empty");
        }
        else{
            System.out.println("string is not empty");
        }
    }
}
