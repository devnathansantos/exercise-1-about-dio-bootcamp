import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.printf("A área do quadrado é: %s", area);
        scanner.close();
    }
}