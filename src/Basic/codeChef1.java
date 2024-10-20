import java.util.Scanner;

class codeChef1
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            System.out.println("Print Your No. :");
            int n = read.nextInt();
            System.out.println(n+1);
        }
    }
}