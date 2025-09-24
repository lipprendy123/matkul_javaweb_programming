package Practice;

import java.util.*;

public class NamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");

        System.out.println("Nama dengan karakter > 3:");
        names.stream()
             .filter(n -> n.length() > 3)
             .forEach(System.out::println);

        long countA = names.stream()
                           .filter(n -> n.startsWith("A"))
                           .count();
        System.out.println("\nJumlah nama diawali huruf A: " + countA);

        System.out.println("\n2 orang pertama:");
        names.stream()
             .limit(2)
             .forEach(System.out::println);

        boolean hasMoreThan5 = names.stream()
                                    .anyMatch(n -> n.length() > 5);
        System.out.println("\nApakah ada nama karakter > 5? " + hasMoreThan5);
    }
}
