package com.fundamentos.springBoot.fundamentos;

import com.fundamentos.springBoot.fundamentos.bean.MyBean;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithDependences;
import com.fundamentos.springBoot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.springBoot.fundamentos.components.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithProperties myBeanWithProperties;

	private MyBeanWithDependences myBeanWithDependences;

	public FundamentosApplication(@Qualifier("componentTwoImplements") ComponentDependency componentDependency, MyBeanWithProperties myBeanWithProperties, MyBean myBean,MyBeanWithDependences myBeanWithDependences){
		this.componentDependency = componentDependency;
		this.myBeanWithProperties = myBeanWithProperties;
		this.myBean = myBean;
		this.myBeanWithDependences = myBeanWithDependences;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		System.out.println(myBeanWithProperties.function());
		myBean.printf();
		myBeanWithDependences.printWithDependency();
	}
}