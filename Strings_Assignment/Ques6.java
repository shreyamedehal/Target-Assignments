import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        //method 1
        String x = "example";
        String y = "example";
        if(x==y)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        //method 2
        String x1 = new String("example");
        String y1 = new String("example");
        if(x1.equals(y1))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        //method 3
        String x2 = new String("example");
        String y2 = new String("Example");
        System.out.println("Comparing " + x2 + " and " + y2 + " : " + x2.equalsIgnoreCase(y2));

        //method 4
        String x3 = new String("example");
        String y3 = new String("example");
        System.out.println("Comparing " + x3 + " and " + y3 + " : " + Objects.equals(x3, y3));

        //method 5
        String x4 = new String("example");
        String y4 = new String("example");
        System.out.println("Comparing " + x4 + " and " + y4 + " : " + x4.compareTo(y4));

    }
}
