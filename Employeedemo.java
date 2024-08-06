package online;
class Employee{
    String name = "Ajay";
    int salary = 2000;
}
class Manager extends Employee{
    String dept = "IT";
    public String toString() {
        return "Manager's name is: " + name + "\n" +
               "Manager's Department is: " + dept + "\n" +
               "Manager's Salary is: " + salary;
    }
}
class Executive extends Manager{
    public String toString() {
        return "Executive\n" + super.toString();
    }
}
public class Employeedemo {
    public static void main(String[] args) {
        Executive e = new Executive();
        System.out.println(e);
    }
}
