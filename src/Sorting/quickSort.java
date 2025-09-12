package Sorting;

public class quickSort {

    static void displayArr(int[] arr){
        for(int num: arr){
            System.out.print(num +" ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;

        for(int i=st+1; i<=end; i++){
            if(arr[i] <= pivot) cnt++;
        }

        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);

        int i=st, j=end;
        while(i<pivotIdx && j>pivotIdx) {
            if (arr[i] > pivot && arr[j] < pivot) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (arr[i] < pivot) {
                i++;
            } else if (arr[j] > pivot){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void sortQuick(int[] arr, int st, int end){
        if(st >= end) return;

        int pi = partition(arr, st, end);
        sortQuick(arr, st, pi-1);
        sortQuick(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2};

        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        sortQuick(arr, 0, arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}
