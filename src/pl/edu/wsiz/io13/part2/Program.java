package pl.edu.wsiz.io13.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee("Jan", "Kowalski", (byte) 30);
        Employee employee2 = new Employee("Anna", "Nowak", (byte) 28);
        Employee employee3 = new Employee("Piotr", "Nowak", (byte) 32);

        company.add(employee1);
        company.add(employee2);
        company.add(employee3);

        company.printEmployees();

        Employee employee11 = new Employee("Jan", "Kowalski", (byte) 30);

        System.out.println(employee1.isEqual(employee2));
        System.out.println(employee1.isEqual(employee11));
    }
}
