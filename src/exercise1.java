import java.time.LocalDate;
import java.util.Scanner;

public class exercise1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: \n");
        String name = scanner.nextLine();

        System.out.println("Digite o ano do seu nascimento: \n");
        int yearOfBorn = scanner.nextInt();

        LocalDate atualData = LocalDate.now();
        int atualDataYear = atualData.getYear();

        int age = atualDataYear - yearOfBorn;

        System.out.printf("Ola %s você tem %s anos.\n", name, age);
        scanner.close();
    }
}
