import java.util.Scanner;

public class MetodosCalculadora {
    public static void mostrarMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Sair");
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            mostrarMenu();

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

                double resultado = somar(n1, n2);

                System.out.println("Resultado: " + resultado);

            } else if (opcao == 2) {
                System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

                double resultado = subtrair(n1, n2);

                System.out.println("Resultado: " + resultado);

            } else if (opcao == 3) {
                System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

                double resultado = multiplicar(n1, n2);

                System.out.println("Resultado: " + resultado);

            } else if (opcao == 4) {
                System.out.print("Digite o primeiro número: ");
                double n1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = scanner.nextDouble();

                if (n2 == 0) {
                    System.out.println("Erro: Não existe divisão por zero.");
                } else {
                    double resultado = dividir(n1, n2);

                    System.out.println("Resultado: " + resultado);
                }
                
            } else if (opcao == 5) {
                System.out.println("Encerrando a calculadora...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}