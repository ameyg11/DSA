package arrayProblems;

class secondLargest{
    static int Largest(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0; i< arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        for (int i=0; i< arr.length; i++){
            if (arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }

}

public class secondMax {
    public static void main(String[] args) {

        int[] arr={9,8,9,6,9,5};
        int[] arr2={-9,-7,0,0,-9,-5};

        System.out.println(secondLargest.Largest(arr));
        System.out.println(secondLargest.Largest(arr2));

    }
}
