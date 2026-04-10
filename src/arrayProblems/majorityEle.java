package arrayProblems;

public class majorityEle {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,};
        int ele=arr[0], ct=1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == ele){
                ct++;
            }else{
                ct--;
                if(ct==0){
                    ct=1;
                    ele=arr[i];
                }
            }
        }

        System.out.println(ele);
    }
}
