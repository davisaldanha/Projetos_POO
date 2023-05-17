package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando objetos do tipo ContaBancaria e referenciando nas
        //variaveis contaBancaria1 e contaBancaria2
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
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
        System.out.print("\nDigite a conta -> ");
        contaBancaria1.conta = scan.next();
        System.out.print("\nDigite o proprietário -> ");
        contaBancaria1.proprietario = scan.next();
        System.out.print("\nDigite o saldo inicial -> ");
        contaBancaria1.saldo = scan.nextDouble();
        
        System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta + "\n"
                + contaBancaria1.proprietario + "\n"
                + contaBancaria1.saldo);
                
    }

}
