package BinarySearch;

public class findOccurrence {

    static int lastOccurrence(int[] arr, int target){
        int s=0,e=arr.length-1, fO=-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                fO=mid;
                s=mid+1;
            } else if (arr[mid] < target) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }

        return fO;
    }
    static int firstOccurrence(int[] arr, int target){
        int s=0,e=arr.length-1, fO=-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                fO=mid;
                e=mid-1;
            } else if (arr[mid] < target) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }

        return fO;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 6, 9};
        int target = 6;

        int fO = firstOccurrence(arr,target);
        if (fO == -1) System.out.printf("%d does not exist", target);
        else System.out.printf("%d occurs first in position %d", target, fO);

        System.out.println();

        int lO = lastOccurrence(arr,target);
        if (lO == -1) System.out.printf("%d does not exist", target);
        else System.out.printf("%d occurs last in position %d", target, lO);

//        fO == -1 ? System.out.printf("%d does not exist", target) : System.out.printf("%d occurs in position %d", fO, target);
    }
}
