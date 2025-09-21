package BinarySearch;

public class searchRotatedArray {

    static int searchTarget(int[] arr,int target){
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
    static int minimum(int[] arr){
        int ans=-1, n=arr.length, s=0, e=n-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] > arr[n-1]){
                s=mid+1;
            }else if (arr[mid] <= arr[n-1]){
                ans = mid;
                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int ans = minimum(arr);
        System.out.println("Minimum value comes at index : " +ans);

        int target=4;
        int ans2= searchTarget(arr,target);
        System.out.printf("%d occurs in position %d", target, ans2);
    }
}
