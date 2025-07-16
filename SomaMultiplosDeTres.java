public class SomaMultiplosDeTres {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i * 3;
        }
        System.out.println("A soma dos 10 primeiros múltiplos de 3 é: " + soma);
    }
}
