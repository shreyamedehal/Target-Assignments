import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the char:");
        int ch = sc.next().charAt(0);
        int ascii = ch;
        //int castAscii = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + ascii);
        //System.out.println("ASCII value of " + ch + " is: " + castAscii);

    }
}
