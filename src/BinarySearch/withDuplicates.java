package BinarySearch;

public class withDuplicates {

    static int targetEleIdx(int[] arr,int target){
        int ans=-1, n=arr.length, s=0, e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid] == target){
                ans = mid;
                return ans;
            }
            if(arr[mid] < arr[e]){
                if(arr[mid] < target && arr[e] >= target){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }else{
                if(arr[s] <= target && arr[mid] > target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 0, 0, 0};
        int target = 2;
        int ans = targetEleIdx(arr, target);
        System.out.println("Target value comes at index : " +ans);
    }
}
