// linear search
public class Question28 {
    public static int linear(int[] arr, int target){
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target= 5;
        System.out.println(target+" is found at index: "+linear(arr, target));
    }
}


