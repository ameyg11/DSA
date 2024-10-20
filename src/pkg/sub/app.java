package pkg.sub;

class app2{
    public int add(int x, int y){
        int z=x+y;
        return z;
    }
}

public class app {
    public static void main(String args[]){




        app2 obj2=new app2();

        int sum=obj2.add(2,3);
        System.out.println(sum);


    }
}
