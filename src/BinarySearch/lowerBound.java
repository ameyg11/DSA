package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
         int[] arr = {1,2,3,6,6,6,6,6,6,12,15,33};
         int x = 6;
         int l=0, r=arr.length-1;
         int ans = -1, idx = -1;


         while(l<=r){
             int mid = l + (r-l)/2;

             if(arr[mid] == x){
                ans = arr[mid];
                idx = mid;
                r = mid - 1;
             }else if(arr[mid] < x){
                 l = mid+1;
             }else{
                 ans = arr[mid];
                 idx = mid;
                 r = r-1;
             }
         }
        System.out.println("answer is " +ans + " and index is " + idx);
    }
}
