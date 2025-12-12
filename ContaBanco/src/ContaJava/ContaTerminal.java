package ContaJava;

import java.util.Scanner;

public class ContaTerminal {

    public static void mensagem(] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        scanner.nextLine(); 
        String agencia = scanner.nextLine();
        String nomeDoCliente = scanner.nextLine();

        scanner.close();

        Usuario Usuario = new Usuario();

       
    }
} 
