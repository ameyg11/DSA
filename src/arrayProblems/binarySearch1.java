package arrayProblems;

public class binarySearch1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,11,24,565,782};
        int target = 565;

        int start = 0;
        int end = arr.length-1;

        int ans= search(arr,target,start,end);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int start ,int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
