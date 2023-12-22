package OOP;

public class Engineer extends Employee{

    public Engineer(String name, int age, int salary){
        super(name, age, salary);
    }

    public void promote(){
        this.setSalary(this.getSalary()+100);
    }
}
