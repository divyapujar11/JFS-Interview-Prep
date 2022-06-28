class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    void enjoy(){
        System.out.println("enjoying");
    }
}

class Employee extends Person{
    float salary;
    Employee(int id, String name, float salary){
        super(id,name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
        super.enjoy();
    }
}

class Superkeywo {

    public static void main(String[] args) {
        Employee emp = new Employee(22145, "ankita", 98758.9f);
        emp.display();
    }
}
