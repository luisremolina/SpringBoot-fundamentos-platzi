package com.fundamentos.springBoot.fundamentos.bean;

public class MyOperationImplements  implements MyOperation{
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
