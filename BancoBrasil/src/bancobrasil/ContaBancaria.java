package bancobrasil;

public class ContaBancaria {

    //Atributos(características) da classe
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;

    //Métodos construtor
    public ContaBancaria(){}
    
    public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario){
        this.agencia= agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }
    
    //Métodos Getters e Setters
    public String getAgencia(){
        return this.agencia;
    }
    
    public String getConta(){
        return this.conta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public Usuario getProprietario(){
        return this.proprietario;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public void setConta(String conta){
        this.conta = conta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setProprietario(Usuario proprietario){
        this.proprietario = proprietario;
    }
    
    //Métodos(comportamentos) da classe
    void depositar(double valor) {//Método com parametro
        this.saldo += valor;
    }

    void sacar(double valor) {//Método com parametro
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }

    void transferir(ContaBancaria contabancaria, double valor) {//Método com parametro
        if (valor <= saldo) {
            this.sacar(valor);
            contabancaria.saldo += valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    String consultarSaldo() {//Método sem parametro
        //String.format() método da classe String para utilizar formatação 
        //com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
}
