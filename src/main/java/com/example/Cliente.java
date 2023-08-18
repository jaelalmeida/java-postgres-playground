package com.example;

class Cliente {
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }   
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("Sexo inválido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

   

    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda){
        if( renda >= 0)
            this.renda = renda;
        else System.out.println("A renda dever ser maior que zero!");
    }

}