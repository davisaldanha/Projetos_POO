package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        /*
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
        user1.setNome(scan.next());
        System.out.print("Digite o sobrenome do cliente -> ");
        user1.setSobrenome(scan.next());
        System.out.print("Digite o telefone do cliente -> ");
        user1.setTelefone(scan.next());
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

         */

        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria contabancaria = new ContaBancaria();

        while (opcao != 3) {
            //1º Tela
            System.out.println("***BANCO BRASIL***");
            System.out.println("1- Cadastro de Cliente");
            System.out.println("2- Cadastro de Conta");
            System.out.println("3- Sair");
            System.out.print("Escolhe uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        user = new Usuario();
                        System.out.println("***CADASTRO DE CLIENTE***");
                        System.out.print("Nome: ");
                        user.setNome(scan.next());
                        System.out.print("Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.printf("Telefone: ");
                        user.setTelefone(scan.next());

                        users[i] = user;
                    }
                    break;
                case 2:
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.print("Agencia: ");
                    contabancaria.setAgencia(scan.next());
                    System.out.print("Conta: ");
                    contabancaria.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");
                    if (users[0] != null) {
                        for (int i = 0; i < 5; i++) {
                            System.out.printf("%d- %s %s\n", i + 1, users[i].getNome(), users[i].getSobrenome());
                        }
                        System.out.print("Selecione o cliente: ");
                        int userOpcao = scan.nextInt();
                        contabancaria.setProprietario(users[userOpcao - 1]);
                    }else
                        System.out.println("Nenhum cliente cadastrado!" + "");
                    
                    break;
                case 3:
                    System.out.println("***ATÉ BREVE!***");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }

    }
}
