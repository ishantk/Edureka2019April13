package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println(">> before executed <<");
		
		if(method.getName().equals("purchaseProduct")){
			for(Object o : inputs){
				System.out.println(">> "+o);
			}
			
			Product p = (Product)beanRef; // We got reference to our Product Object
			System.out.println(">> PreProcessing for "+p.getName());
		}
	}
	
}
