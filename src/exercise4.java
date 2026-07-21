import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da 1ª pessoa: \n");
        String name1 = scanner.nextLine();

        System.out.print("Digite a idade da 1ª pessoa: \n");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da 2ª pessoa: \n");
        String name2 = scanner.nextLine();

        System.out.print("Digite a idade da 2ª pessoa: \n");
        int age2 = scanner.nextInt();

        int diference = Math.abs(age1 - age2);

        System.out.printf("A diferença de idade entre %s e %s é de %s anos", name1, name2, diference);

        scanner.close();
    }
}