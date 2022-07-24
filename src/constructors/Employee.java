package constructors;

public class Employee {


    public String name, jobTitle;
    public int ID;
    public double salary;
    public static String companyName;

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;

    }

    static{
        companyName="Microsoft"; // this value is same for all the objects for this class

    }

    public Employee() { //default Constructor
        salary=10000; // default for all employee created by this constructor
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", company name=" + companyName +
                '}';
    }


}
