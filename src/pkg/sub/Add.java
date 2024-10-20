package pkg.sub;

class algebra{
    int a;
    int b;

    algebra(int x,int y){
        System.out.println("Aljebra is called");
        int a=x;
        int b=y;
    }
    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class Add {
    public static void main(String[] args) {

        algebra obj = new algebra(5 ,3);
        System.out.println(obj);
        System.out.println(obj.sum());
        System.out.println(obj.sub());
    }

}
