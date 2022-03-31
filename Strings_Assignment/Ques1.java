public class Ques1 {
    public static void Check(Object x, Object y){
        if(x==y){
            System.out.println("both are pointing to the same reference");
        }
        else{
            System.out.println("both are pointing to different reference");
        }
    }
    public static void main(String[] args) {
        String x = "Shreya";
        String y = "Shreya";
        System.out.println("before modification in str x");
        Check(x,y);
        x += "M";
        System.out.println("after modification in str x");
        Check(x,y);
    }
}
