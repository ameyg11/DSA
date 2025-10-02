package BinarySearch;

/*
You have 'n'(n <= IOA5) boxes of chocolate. Each box contains a[i] (a[i] <= 10000) chocolates. You need to distribute these boxes among 'm' students such
that the maximum number of chocolates allocated to a student is minimum.
One box will be allocated to exactly one student.
a)
b)
All the boxes should be allocated.
Each student has to be allocated at least one box.
c)
Allotment should be in contiguous order, for instance, a student cannot be allocated box I and box 3, skipping box 2.
d)
Calculate and return that minimum possible number.
Assume that it is always possible to distribute the chocolates.
The first line of input will contain the value of n, the number of boxes.
The second line of input will contain the n numbers denoting the number of chocolates in each box.
The third line will contain the m, number of students.
Input
4
12 34 67 90
2
Output
113
* */

public class DistributeChocolates {

    static boolean isDivisionPossible(int[] arr, int m, int mxChocoAlllowed){
        int numStudents = 1;
        int choc = 0;                             // no. of chocolate of current student

        for(int i=0; i<arr.length; i++){
            if(arr[i] > mxChocoAlllowed) return false;

            if(choc + arr[i] <= mxChocoAlllowed){
                choc += arr[i];
            }else{
                numStudents++;
                choc = arr[i];
            }
        }
        if (numStudents > m){
            return false;
        }

        return true;
    }

    static int distributeChocolates(int[] arr, int m){
        if(arr.length < m) return -1;
        int st=1, ans=0, end=(int)1e9;

        while(st<= end) {
            int mid = st + (end - st)/2;

            if (isDivisionPossible(arr, m, mid)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 6};
        int m = 2;

        System.out.println(distributeChocolates(arr, m));
    }
}
