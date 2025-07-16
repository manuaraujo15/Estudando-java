import java.util.Scanner;

public class FuncaoFx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para x: ");
        int x = scanner.nextInt();
        int fx;

        if (x >= 0 && x < 5) {
            fx = x;
        } else if (x >= 5 && x < 10) {
            fx = 2 * x + 1;
        } else {
            fx = x - 3;
        }

        System.out.println("f(x) = " + fx);
        scanner.close();
    }
}
