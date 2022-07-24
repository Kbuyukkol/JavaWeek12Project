package constructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {
        
        Employee employee1= new Employee();

        System.out.println("employee1 = " + employee1);

        employee1.name="Kamuran";
        employee1.ID=141;
        employee1.jobTitle="QA";
        employee1.salary= 20000;

        System.out.println("employee1 = " + employee1);

        Employee employee2= new Employee("Ali", "SDET",111,10000);

        System.out.println("employee2 = " + employee2);

        ArrayList<Employee> team= new ArrayList<>();
        team.add(employee1);
        team.add(employee2);
        team.add(new Employee("Ayse","CTO",154,25000));

        System.out.println(team);

        double maxSalary= Double.MIN_VALUE;
        for(Employee each: team) {
            if(each.salary>maxSalary) {
                maxSalary= each.salary;
            }
        }
        System.out.println(maxSalary);

        for(Employee each: team) {
            if (each.name.equals("Ayse")) {
                System.out.println(each.jobTitle);
            }
        }

        // employee1.companyName= "Tesla";
        Employee.companyName= "Tesla";
        for(Employee each: team) {
            System.out.println(each.name+" is working for "+ each.companyName);
        }

    }
}
