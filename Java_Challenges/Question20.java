public class Question20 {
    public static void main(String[] args) {
        String str = "I am always ready to learn although I do not always like being taught.";
        char[] x = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(x[i] == 'a')
                x[i]='$';
        }
        System.out.println(x);

    }
}
