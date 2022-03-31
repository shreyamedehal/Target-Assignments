import java.util.*;

public class Question26 {
    static boolean isPalindrome(String str){
        if(str==null || str.length()==0){
            System.out.println("String is a palindrome");
            return true;
        }
        str=str.toLowerCase();
        for(int i=0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                System.out.println("String is not a palindrome");
                return false;
            }
        }
        System.out.println("String is a palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String checkstr = sc.nextLine();
        isPalindrome(checkstr);
    }
}
