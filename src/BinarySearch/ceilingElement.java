//smallest element in array greater or equal to target

package BinarySearch;

public class ceilingElement {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 3, 4, 7, 55, 75, 87, 99, 765, 945};
        int target = 946;


        System.out.println(findELement(arr,target));
    }

    static int findELement(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length-1]) return -1;

        while (start <= end) {

            int mid = start + (end-start)/2;

            if (arr[mid] <  target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
            ans = arr[mid + 1];
        }


        return ans;
    }
}
