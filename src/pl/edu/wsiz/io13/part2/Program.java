package pl.edu.wsiz.io13.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger("company-log.txt", true, true);

        Company company = new Company(fileLogger);

        company.add(new Developer("Jan", "Kowalski", (byte) 30, Sex.MALE, 3000, new String[]{"Java", "SQL"}));
        company.add(new Developer("Anna", "Nowak", (byte) 28, Sex.FEMALE, 3500, new String[]{"PHP", "SQL"}));
        company.add(new Manager("Piotr", "Nowak", (byte) 32, Sex.MALE, 2800, new String[]{"HTML", "CSS", "JS"}, 8));

        int operationNumber = 0;

        while (operationNumber != 9) {

            System.out.print("""

                    Lista operacji:

                    1 - wypisz listę pracowników
                    2 - dodaj programistę
                    3 - dodaj kierownika
                    4 - usuń pracownika
                    9 - zakończ program

                    Podaj numer operacji:\s""");

            operationNumber = scanner.nextInt();
            System.out.println();

            switch (operationNumber) {
                case 1:
                    company.printEmployees();
                    break;
                case 2:
                    company.add(Developer.read());
                    break;
                case 3:
                    company.add(Manager.read());
                    break;
                case 4:
                    System.out.print("Podaj numer pracownika do usunięcia: ");
                    int employeeNumber = scanner.nextInt();
                    company.removeEmployee(employeeNumber);
                    break;
                case 9:
                    break;
                default:
                    System.out.print("Operacja o podanym numerze nie istnieje!");
            }
        }
    }
}