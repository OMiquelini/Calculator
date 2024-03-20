package com.miquelini.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miquelini.calculadora.entities.Operacao;
import com.miquelini.calculadora.entities.Resultado;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @PostMapping("/calcular")
    public Resultado calcular(@RequestBody Operacao op)
    {
        Resultado res = new Resultado();
        if(op.getTipo().equals("soma"))
        {
            res.setResultado(op.getNum1() + op.getNum2());
        }
        else if(op.getTipo().equals("subtracao"))
        {
            res.setResultado(op.getNum1() - op.getNum2());
        }
        else if(op.getTipo().equals("multiplicacao"))
        {
            res.setResultado(op.getNum1() * op.getNum2());
        }
        else if(op.getTipo().equals("divisao"))
        {
            if(op.getNum2() == 0)
            {
                throw new IllegalArgumentException("Divisão por zero");
            }
            res.setResultado(op.getNum1() / op.getNum2());
        }
        else
        {
            throw new IllegalArgumentException("Operação inválida");
        }
        return res;
    }

    @GetMapping("/health")
    public String health()
    {
        return "ok";
    }
}
