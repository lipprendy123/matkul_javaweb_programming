package Abstract;

import Abstract.Class.Manager;
import Abstract.Class.Staff;

public class Main {
    public static void main(String[] args) {
        Manager u1 = new Manager("Joe", 1000000);
        Staff u2 = new Staff("Jenie", 2000000);

        System.out.println(u1.getName() + ", Salary: " + u1.calculateBonus());
        System.out.println(u2.getName() + ", Salary: " + u2.calculateBonus());
    }
}
