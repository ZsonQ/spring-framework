package com.spring.zyp.beandefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.stereotype.Component;

/**
 * 自定义BeanDefinition类型
 */
@Component
public class MyBeanDefinitionCustomizer implements BeanDefinitionCustomizer {
	@Override
	public void customize(BeanDefinition bd) {
	}
}
