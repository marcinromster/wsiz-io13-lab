package pl.edu.wsiz.io13.part2;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.firstname = "Jan";
        employee1.lastname = "Kowalski";
        employee1.age = 30;

        Employee employee2 = new Employee();
        employee2.firstname = "Anna";
        employee2.lastname = "Nowak";
        employee2.age = 28;

        Employee employee3 = Employee.read();

        employee1.print();
        employee2.print();
        employee3.print();
    }
}
