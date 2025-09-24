package Class;

abstract class User {
    protected String name;
    protected double baseSalary;

    public User(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateBonus();

    public String getName() {
        return name;
    }
}
