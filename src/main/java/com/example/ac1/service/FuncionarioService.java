package com.example.ac1.service;
import java.util.List;

import com.example.ac1.entidade.Funcionario;
import com.example.ac1.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository fr;

    public Funcionario cadastraFuncionario(int codigo, String nome, double salario, int idade, String cpf){
        Funcionario f = new Funcionario(codigo,nome,salario,idade,cpf);
        return f;
    }


    public List<Funcionario> getFuncionarios(){
        return fr.findAll();
    }
}