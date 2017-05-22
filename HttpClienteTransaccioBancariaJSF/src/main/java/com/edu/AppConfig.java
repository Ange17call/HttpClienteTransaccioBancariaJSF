package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;


@Configuration
@ComponentScan("com.edu")
public class AppConfig {
	
	@Bean("transaccionBancaria")
	public HttpInvokerProxyFactoryBean servicioOperaciones(){
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:9090/transaccionBancaria");
		proxy.setServiceInterface(TransaccionBancaria.class);
		return proxy;
	}

}
