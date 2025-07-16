import java.util.Scanner;

public class AcimaDoPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.print("Digite o peso (ou -1 para sair): ");
            double peso = scanner.nextDouble();
            if (peso == -1) break;

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);
            if (imc > 25) {
                contador++;
            }
        }

        System.out.println("Número de pessoas acima do peso: " + contador);
        scanner.close();
    }
}
