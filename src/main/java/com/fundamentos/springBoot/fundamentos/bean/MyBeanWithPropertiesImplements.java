package com.fundamentos.springBoot.fundamentos.bean;

public class MyBeanWithPropertiesImplements implements MyBeanWithProperties {

    private String name;
    private String apellido;


    public MyBeanWithPropertiesImplements(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return "Mi nombre es " + name + " y mi apellido es " + apellido;
    }
}
