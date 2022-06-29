
class A{
    void display1(){
        System.out.println("from Class A");
    }
}

class B extends A{
    void display(){
        System.out.println("from Class B");
    }
}

class Inheritence_single{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.display1();
    }
}