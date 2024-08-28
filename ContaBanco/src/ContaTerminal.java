import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome!");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        String conta = sc.nextLine();

        System.out.println("Por favor, digite o valor que deseja depositar!");
        double deposito = sc.nextDouble();


        System.out.println("Olá, " + nome +". Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + "e seu saldo " + deposito + "já está disponível para saque.");

        sc.close();
    }
}
