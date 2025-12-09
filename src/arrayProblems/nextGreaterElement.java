package arrayProblems;

import java.util.Arrays;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            res[i] = -1;
            int k=0;
            while(k < nums2.length){
                if(nums1[i] == nums2[k]){
                    break;
                }
                k++;
            }
            for(int j=k+1; j<nums2.length; j++){
                if(j < nums2.length && nums1[i] < nums2[j]){
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
