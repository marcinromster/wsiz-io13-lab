package pl.edu.wsiz.io13.part2;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalski", (byte) 30);
        Employee employee2 = new Employee("Anna", "Nowak", (byte) 28);
        Employee employee3 = Employee.read();

        employee1.print();
        employee2.print();
        employee3.print();
    }
}
