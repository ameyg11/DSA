package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human amey = new Human("Amey", 21, 10000, false);
//        System.out.println(amey.name);
//
//        Human sunil = new Human("sunil", 21, 10000, false);
//        Human tejas = new Human("tejas", 21, 10000, false);
//        Human siddesh = new Human("siddesh", 21, 10000, false);
//        Human sanjay = new Human("sanjay", 21, 10000, false);
//
//        Human kunal = new Human("kunal", 22, 100000, true);
//        System.out.println(kunal.name);
//        System.out.println(kunal.population);  // ❌
//        System.out.println(Human.population); //✅  // while accessing the static variable access it via the class(Human here)
                                                // don't access it via the objects(kunal.population / amey.popu..)
        Main obj = new Main();
        obj.fun2();
        fun();
    }

    static void fun(){
//        greeting();


        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hey hello");
    }
}
