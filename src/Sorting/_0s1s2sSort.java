package Sorting;

public class _0s1s2sSort {
    static void displayArr(int[] arr){
        for(int val: arr){
            System.out.print(val +" ");
        }
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void countSort(int[] arr){
        int x=0,y=0,z=0,k=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) x++;
            if(arr[i]==1) y++;
            if(arr[i]==2) z++;
        }

        while(k<arr.length){
            while (x>0){
                arr[k] = 0;
                x--;
                k++;
            }
            while (y>0){
                arr[k] = 1;
                y--;
                k++;
            }
            while (z>0){
                arr[k] = 2;
                z--;
                k++;
            }
        }
    }

    static void optimizeSort(int[] arr){
        int low=0,mid=0,high=arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else if (arr[mid] == 2) {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 2, 0, 0, 1, 1, 2, 2, 0, 1};
        optimizeSort(arr);
        displayArr(arr);
    }
}
