import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: \n");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: \n");
        double altura = scanner.nextDouble();
        double area = base * altura;

        System.out.printf("A área do retângulo é: %s", area);

        scanner.close();
    }
}