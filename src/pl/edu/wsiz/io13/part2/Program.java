package pl.edu.wsiz.io13.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 30, Sex.MALE, 3000));
        company.add(new Employee("Anna", "Nowak", (byte) 28, Sex.FEMALE, 3500));
        company.add(new Employee("Piotr", "Nowak", (byte) 32, Sex.MALE, 2800));

        int operationNumber = 0;

        while (operationNumber != 9) {

            System.out.print("""

                    Lista operacji:

                    1 - wypisz listę pracowników
                    2 - dodaj pracownika
                    3 - usuń pracownika
                    9 - zakończ program

                    Podaj numer operacji:\s""");

            operationNumber = scanner.nextInt();
            System.out.println();

            switch (operationNumber) {
                case 1:
                    company.printEmployees();
                    break;
                case 2:
                    company.add();
                    break;
                case 3:
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