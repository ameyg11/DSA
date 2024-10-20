//Find the unique number in a given Array where all the elements are being
// repeated twice with one value being unique.

package arrayProblems;

public class uniqueNum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1, 3, 2};

        for (int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                System.out.println("Unique Value Of Array Is : "+arr[i]);
            }
        }
    }
}
