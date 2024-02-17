package pl.edu.wsiz.io13.part2;

public abstract class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;
    private final Sex sex;
    protected final int salary;
    protected final String[] skills;

    Employee(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    void print() {
        String string = this.toString();
        System.out.printf("%s\n", string);

//        System.out.printf("%s\n", this);
    }

    @Override
    public String toString() {
        String sexStr = sex == Sex.FEMALE ? "K" : "M";
        String skillsStr = String.join(", ", skills);

        return String.format("%s %s %d %s %.2fzł [%s]", firstname, lastname, age, sexStr, getTotalSalary(), skillsStr);
    }

    public abstract double getTotalSalary();

    public boolean isEqual(Employee otherEmployee) {
        return this.firstname.equalsIgnoreCase(otherEmployee.firstname)
                && this.lastname.equalsIgnoreCase(otherEmployee.lastname)
                && this.age == otherEmployee.age
                && this.sex == otherEmployee.sex;
    }
}
