package arrayProblems;

class Val{
    static int repeat(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    //this approach is good for time complexity even it is same (n logn) there is one more approach but using hash map TC O(n)
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        for (int i = 1; i < n; i++) {
//            if (nums[i] == nums[i - 1])
//                return true;
//        }
//        return false;
//    }

}

public class repeatedValues {
    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 3, 3, 4, 1};

        System.out.println(Val.repeat(arr));

    }
}