import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o número de agência:");
        String agencia = teclado.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        Integer numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Por favor, Informe o nome do cliente:");
        String nome = teclado.nextLine();

        System.out.println("Por favor, Informe o saldo da conta");
        Double saldo = teclado.nextDouble();

        System.out.printf("""
                Olá %s, obrigado por criar uma conta em nosso banco,
                sua agência é %s,
                conta %d,
                e seu lado é R$ %.2f já disponível para saque.
                """, nome, agencia, numero, saldo);

    }
}
