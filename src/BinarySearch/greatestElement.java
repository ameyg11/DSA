package BinarySearch;

public class greatestElement {
    public static void main(String args[]){
        int[] arr = {-1, 0, 2, 3, 4, 7, 55, 75, 87, 99, 765, 945};
        int target = 75;

        System.out.println(findELement(arr,target));

    }

    static int findELement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
