import java.util.*;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        System.out.println("Enter the height:");
        double h = sc.nextDouble();
        double  volume=((22*r*r*h)/7);
        System.out.println("volume of Cylinder is: " +volume);

    }
}
