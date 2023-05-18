package bancobrasil;

public class ContaBancaria {

    //Atributos(características) da classe
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;

    //Métodos(comportamentos) da classe
    void depositar(double valor) {//Método com parametro
        this.saldo += valor;
    }

    void sacar(double valor) {//Método com parametro
        if(valor > saldo)
            System.out.println("Saldo Insuficiente!");
        else
            this.saldo -= valor;
    }

    void transferir() {
    }

    String consultarSaldo() {//Método sem parametro
        //String.format() método da classe String para utilizar formatação 
        //com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
}
