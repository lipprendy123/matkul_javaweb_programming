package Class;

public class Manager extends User {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary + (0.2 * baseSalary);
    }
}
