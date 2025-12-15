package ContaJava;

import java.util.Scanner;

 public class ContaTerminal {

    public static void main(String [] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String nomeDoCliente = scanner.nextLine();
        String agencia = scanner.nextLine();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        Usuario Usuario = new Usuario();
        
        Usuario.mensagem(nomeDoCliente, numeroConta, saldo, agencia);
         scanner.close();

        
       
    }
} 
