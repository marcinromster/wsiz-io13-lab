package pl.edu.wsiz.io13.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 30));
        company.add(new Employee("Anna", "Nowak", (byte) 28));
        company.add(new Employee("Piotr", "Nowak", (byte) 32));

        company.add();

        company.printEmployees();
    }
}
