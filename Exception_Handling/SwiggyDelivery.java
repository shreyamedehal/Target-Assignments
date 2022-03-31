import java.util.*;

class InvalidZipCodeException extends Exception{
    public InvalidZipCodeException(String s){
        super(s);
    }
}

public class SwiggyDelivery {

    static void validate(int zipcode) throws InvalidZipCodeException {
        if(zipcode==123 || zipcode==456 || zipcode==789)
            throw new InvalidZipCodeException("Delivery not available in your area!");
        else
            System.out.println("Delivery is available in your area!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the zip code ");
        int zip = sc.nextInt();

        try{
           validate(zip);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
