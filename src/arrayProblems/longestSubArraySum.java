package arrayProblems;

public class longestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1 ,9};
        int target = 15;
        int maxCount = 0;
        for(int i=0; i<arr.length-1; i++){
            int count = 1;
            int sum = arr[i];

            for(int j=i; j<arr.length; j++){
                if(j == i) continue;
                sum += arr[j];

                if(sum == target){
                    count++;
                    maxCount = Integer.max(maxCount, count);
                    break;
                } else if (sum < target) {  
                    count++;
                }else{
                    break;
                }
            }
        }
        System.out.println(maxCount);
    }
}
