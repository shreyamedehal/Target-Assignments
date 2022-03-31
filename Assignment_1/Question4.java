public class Question4 {
    static void swap2(int a, int b){
        System.out.println("before swapping a and b are: "+ a +" "+ b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("after swapping a and b are: "+ a +" "+ b);
    }

    static void swap3(int a, int b, int c){
        System.out.println("before swapping a, b, c are: "+ a +" "+ b+" "+ c);
        int temp = a;
        a=b;
        b=c;
        c=temp;
        System.out.println("after swapping a, b, c are: "+ a +" "+ b+" "+ c);
    }

    public static void main(String[] args) {
        swap2(5,10);
        swap3(10,20,30);

    }
}
