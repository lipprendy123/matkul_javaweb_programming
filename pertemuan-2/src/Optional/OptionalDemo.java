import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Optional dengan nilai null
        Optional<String> name = Optional.ofNullable(null);

        if (name.isPresent()) {
            System.out.println("Nama: " + name.get());
        } else {
            System.out.println("Nama tidak tersedia");
        }

        // Optional dengan nilai "John Doe"
        Optional<String> nameOptional = Optional.of("John Doe");
        System.out.println(nameOptional.get());

        // Menggunakan orElse untuk nilai default
        String result = name.orElse("Default Name");
        System.out.println(result);
    }
}
