import java.util.Scanner;

public class Question14 {
    static int substring(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (str2.charAt(i + j) != str1.charAt(j))
                    break;

            if (j == m)
                return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        int res = substring(str1,str2);
        if(res == 1)
            System.out.println(str1+ " is in "+ str2);
        else
            System.out.println(str1+ " is not in "+ str2);
    }
}
