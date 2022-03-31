public class Question5 {
    static void oddeven(int num){
        if(num%2==0){
            System.out.println(num+ " is even");
        }else{
            System.out.println(num+ " is odd");
        }
    }

    public static void main(String[] args) {
        oddeven(23);
        oddeven(20);
    }
}
