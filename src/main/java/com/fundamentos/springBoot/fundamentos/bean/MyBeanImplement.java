package com.fundamentos.springBoot.fundamentos.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void printf() {
        System.out.println("Hola desde la implementation propia de mi bean");
    }
}
