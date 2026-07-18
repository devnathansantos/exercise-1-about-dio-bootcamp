import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        int yearOfBorn = scanner.nextInt();

        LocalDate atualData = LocalDate.now();
        int atualDataYear = atualData.getYear();

        int age = atualDataYear - yearOfBorn;

        System.out.printf("Ola %s você tem %s anos.%n", name, age);
        scanner.close();
    }
}
