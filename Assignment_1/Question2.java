public class Question2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n){
        for (int row=1; row<=n; row++){
            int col = row;
            int space = n-col;
            for (int i=0; i<space; i++){
                System.out.print(" ");
            }
            for(col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

