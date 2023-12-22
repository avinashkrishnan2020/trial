package OOP;

public class Manager extends Employee{

    public Manager(String name, int age, int salary){
        super(name, age, salary);
    }

    public void promote(){
        this.setSalary(this.getSalary()+500);
    }
}
