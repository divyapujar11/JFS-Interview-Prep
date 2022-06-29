class A{
    void run(){
        System.out.println("run");
    }
}

class B extends A{
    void jump(){
        System.out.println("Jump");
    }
}

class C extends A{
    void kick(){
        System.out.println("kick");
    }
}

class Inherit_Hierarchial {
    public static void main(String[] args) {
        C obj = new C();
        obj.kick();
        obj.run();
    }
}
