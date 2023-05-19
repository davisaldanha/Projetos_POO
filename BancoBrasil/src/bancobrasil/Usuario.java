package bancobrasil;

import java.util.Date;

public class Usuario {

    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();

    //Método construtor
    public Usuario() {
    }
    //Método construtor
    public Usuario(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }
    
    //Métodos getters e setters
    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public Date getDataRegistro(){
        return this.dataRegistro;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setDataRegistro(Date dataRegistro){
        this.dataRegistro = dataRegistro;
    }
    
    String imprimirInfo() {
        return String.format("INFORMAÇÕES DO CLIENTE\nNome: %s\nSobrenome: %s\nTelefone: %s\nData Registro: %s",
                this.nome, this.sobrenome, this.telefone, this.dataRegistro);
    }
}
