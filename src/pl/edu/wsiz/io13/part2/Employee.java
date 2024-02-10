package pl.edu.wsiz.io13.part2;

public abstract class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;
    private final Sex sex;
    private final int salary;
    private final String[] skills;

    Employee(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    void print() {
        String sexStr = sex == Sex.FEMALE ? "K" : "M";
        String skillsStr = String.join(", ", skills);

        System.out.printf("%s %s %d %s %dzł [%s]\n", firstname, lastname, age, sexStr, salary, skillsStr);
    }

    public boolean isEqual(Employee otherEmployee) {
        return this.firstname.equalsIgnoreCase(otherEmployee.firstname)
                && this.lastname.equalsIgnoreCase(otherEmployee.lastname)
                && this.age == otherEmployee.age
                && this.sex == otherEmployee.sex;
    }
}
