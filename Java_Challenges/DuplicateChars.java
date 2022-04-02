import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        int count=0;
        System.out.println("Duplicate characters in a given string: ");
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j< str.length(); j++){
                if(strArr[i]==strArr[j]){
                    System.out.println(strArr[j]);
                    count++;
                    break;
                }
            }
        }

    }
}
