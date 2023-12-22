package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Father father = new Father("Sam", 50);
        Father child = new Child("Peter", 12, "ISM",true);
        System.out.println(child.toString());

        Employee engineer1 = new Engineer("Rick", 24, 1000);
        System.out.println(engineer1.toString());
        Employee manager1 = new Manager("Altman", 40, 1000);
        System.out.println(manager1.toString());

        List<Employee> employeesList = Arrays.asList(engineer1, manager1);
        promoteEmployee(employeesList);

    }

    public static void promoteEmployee(List<Employee> employees){
        employees.stream().forEach(employee -> {
            employee.promote();
            System.out.println(employee.toString());
        });
    }
}
