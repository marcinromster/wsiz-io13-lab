package pl.edu.wsiz.io13.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 30));
        company.add(new Employee("Anna", "Nowak", (byte) 28));
        company.add(new Employee("Piotr", "Nowak", (byte) 32));

        System.out.println("Lista operacji:");

        System.out.println("1 - wypisz listę pracowników");
        System.out.println("2 - dodaj pracownika");
        System.out.println("3 - usuń pracownika");
        System.out.println("9 - zakończ program");

        System.out.println("Podaj numer operacji:");
    }
}
