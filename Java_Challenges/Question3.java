public class Question3 {
    public static void main(String[] args) {
        int cost = 50;
        int discount = 12;
        int discount_amt = (cost*discount)/100;
        int selling_price = cost - discount_amt;
        System.out.println("discount amount: "+ discount_amt);
        System.out.println("selling price: "+ selling_price);

    }
}
