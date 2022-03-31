// binary search
public class Question29 {
    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                System.out.println("Element found at index: " + mid);
                return mid;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target =5;
        binarySearch(arr,target);
    }
}
