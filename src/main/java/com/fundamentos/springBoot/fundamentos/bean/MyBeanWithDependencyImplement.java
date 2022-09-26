package com.fundamentos.springBoot.fundamentos.bean;

public class MyBeanWithDependencyImplement  implements MyBeanWithDependences{

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 5;
        System.out.println(myOperation.sum(numero));
        System.out.println("Holad esde la implementaciond e un bean con dependencia");
    }
}
