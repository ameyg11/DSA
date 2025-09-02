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

    static int findIdxSub(String a, String b){
        int idx=0,i=0,j=0;
        while(i <= a.length() - b.length()) {
            if (b.equals(a.substring(i, b.length() + i))) {
                return idx;
            } else {
                if (i <= a.length() - b.length()) {
                    i++;
                    idx = i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int ans = findIdxSub("mississippi", "issip");
        System.out.println(ans);

        /*String a = "ameygawade", b= "eygaw";
        int i =0;
        System.out.println(a.substring(0,4));
        while(i <= a.length()) {
            if (b.substring(0) == a.substring(i)) {
                System.out.print(b.substring(0));
                System.out.print(a.substring(i));
                System.out.print(i);
            }else i++;
        }*/
    }
}
