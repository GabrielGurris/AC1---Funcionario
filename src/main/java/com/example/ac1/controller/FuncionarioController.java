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

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("cadastro");
        
        mv.addObject("funcionarios", fs.getFuncionarios());

        return mv;
    }

    @PostMapping("/cadastra")
    public String cadastra(@ModelAttribute Funcionario func)
    {
        fs.cadastraFuncionario(func);
        return "redirect:/funcionarios";
    }
}