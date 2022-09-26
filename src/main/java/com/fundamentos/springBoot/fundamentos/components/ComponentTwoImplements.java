package com.fundamentos.springBoot.fundamentos.components;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplements implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("HOLA MUNDO DESDE EL TWO IMPLEMENTS");
    }
}
