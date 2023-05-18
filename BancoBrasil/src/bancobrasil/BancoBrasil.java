package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando objetos do tipo ContaBancaria e referenciando nas
        //variaveis contaBancaria1 e contaBancaria2
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
        /*
        Uso nas versões mais atuais da jdk
        var contaBancaria1 = new ContaBancaria();
        
        
        //Atribuindo valores ao nosso objeto
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo = 1.99;
        
        //Exibindo os valores atribuidos
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario + "\n"
                + contaBancaria1.saldo);

        */
        
        Scanner scan = new Scanner(System.in);
        
        //Atribuindo valores ao objeto(utilizando interação com o usuário)
        System.out.println("BEM-VINDO AO BANCO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.print("Digite a agência -> ");
        contaBancaria1.agencia = scan.next();
        System.out.print("Digite a conta -> ");
        contaBancaria1.conta = scan.next();
        
        //Inserção de dados do usuario
        System.out.println("Dados do Usuário");
        System.out.print("Digite o nome do cliente -> ");
        user1.nome = scan.next();
        System.out.print("Digite o sobrenome do cliente -> ");
        user1.sobrenome = scan.next();
        System.out.print("Digite o telefone do cliente -> ");
        user1.telefone = scan.next();
        contaBancaria1.proprietario = user1;
        
        System.out.print("\nDigite o valor de deposito -> ");
        contaBancaria1.depositar(scan.nextDouble());
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario.imprimirInfo() + "\n"
                + contaBancaria1.consultarSaldo());
        
        System.out.print("\n\nDigite o valor para saque -> ");
        contaBancaria1.sacar(scan.nextDouble());
        
        System.out.println(contaBancaria1.consultarSaldo());
                
    }
}
