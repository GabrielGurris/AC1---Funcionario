package com.example.ac1.controller;

import com.example.ac1.entidade.Funcionario;
import com.example.ac1.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioService fs;

    @GetMapping("/cadastra")
    public String cadastra(){
        return "cadastro";
    }

    @PostMapping("/cadastra")
    public ModelAndView criaFuncionario(@ModelAttribute Funcionario func){
        ModelAndView mv = new ModelAndView("funcionarios");
        
        func = fs.cadastraFuncionario(func.getCodigo(),func.getNome(), func.getSalario(), func.getIdade(), func.getCpf());

        mv.addObject("funcionarios", func);

        return mv;
    }

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionarios");
        
        mv.addObject("funcionarios", fs.getFuncionarios());

        return mv;
    }
}