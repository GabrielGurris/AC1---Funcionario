package com.example.ac1.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Funcionario
 */
@Entity
public class Funcionario {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private double salario;
    private int idade;
    private String cpf;

    public Funcionario(int codigo, String nome, double salario, int idade, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cpf = cpf;
	}

	public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", cpf=" + cpf + ", idade=" + idade + ", nome=" + nome + ", salario="
                + salario + "]";
    }

    
    
}