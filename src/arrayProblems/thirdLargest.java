package arrayProblems;
import java.util.Scanner;
import java.util.Arrays;


public class thirdLargest {
    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner sc =new Scanner(System.in);
        System.out.print ("Enter array size ");
        int n = sc.nextInt();
        int[] arr =new int[n];

        System. out. println ( " Enter Arrays Elements ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int[] arr2=new int[n];
        int temp=0;
        int j=n-1;

        for (int i=0;i<n;i++){
                arr2[j]=arr[i];
                j--;
        }

//        System.out.println(Arrays.toString(arr2));
        if (n<3){
            System.out.println("-1");
        }
        else{
            System.out.println(arr2[2]);
        }
    }
}
