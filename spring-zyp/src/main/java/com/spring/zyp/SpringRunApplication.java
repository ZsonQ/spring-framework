package com.spring.zyp;

import com.spring.zyp.beandefinition.MyBeanDefinitionRegistryPostProcessor;
import com.spring.zyp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringRunApplication{

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.register(AppConfig.class);
		MyBeanDefinitionRegistryPostProcessor postProcessor = new MyBeanDefinitionRegistryPostProcessor();
		//todo:添加不进去
		context.addBeanFactoryPostProcessor(postProcessor);
		context.refresh();
	}
}
