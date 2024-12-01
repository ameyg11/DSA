//greatest element in array smaller or equal to target

package BinarySearch;

public class floorElement {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 3, 4, 7, 55, 75, 87, 99, 765, 945};
        int target = 76;


        System.out.println(findELement(arr,target));
    }

    static int findELement(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[0]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = arr[mid]; // Update floor
                start = mid + 1; // Move right to find a closer floor
            }
        }
        return ans;
    }
}
