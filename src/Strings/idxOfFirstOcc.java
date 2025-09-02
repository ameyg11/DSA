package Strings;

public class idxOfFirstOcc {

    static int findIdx(String a, String b){
        int idx=0,i=0,j=0;

        while(i < a.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
                if(j >= b.length()) return idx;
            }else{
                j=0;
                if(a.charAt(i)!= b.charAt(j)){
                    i++;
                }
                idx=i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int ans = findIdx("leetcode", "code");
        System.out.println(ans);
    }
}
