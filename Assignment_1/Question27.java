import java.util.Scanner;
public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int t1 = num;
        int len=0;
        while(t1!=0){
            t1= t1/10;
            len = len +1;
        }
        int t2=num, arm=0;
        while(t2!=0){
            int mul=1;
            int rem = t2%10;
            for(int i=1; i<=len; i++){
                mul = mul*rem;
            }
            arm = arm+mul;
            t2 = t2/10;
        }
        if(num==arm)
            System.out.println(num+ " is Armstrong Number");
        else
            System.out.println(num+ " is not Armstrong Number");

    }
}
