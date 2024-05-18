package com.mycompany.banco;

public class Cadastro {
    private String nome,email,sexo,cpf,senha;
    private int idade;
    
    public Cadastro(){

    }

    public Cadastro(String nome, String email, String sexo, String cpf,String senha,int idade){
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
