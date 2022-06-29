class A{
    void run(){
        System.out.println("run class A");
    }
}

class B extends A{
    void walk(){
        System.out.println("walk class B");
    }
}

class C extends B{
    void sprint(){
        System.out.println("sprint class C");
    }
}
public class Inherit_multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.sprint();
        obj.walk();
        obj.run();
    }
}
