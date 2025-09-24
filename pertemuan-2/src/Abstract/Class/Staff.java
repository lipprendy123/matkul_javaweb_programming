package Abstract.Class;

public class Staff extends User {

    public Staff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary + (0.3 * baseSalary);
    }
}
