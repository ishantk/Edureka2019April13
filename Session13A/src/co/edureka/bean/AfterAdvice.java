package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println(">> after executed <<");
		if(method.getName().equals("purchaseProduct")){
			for(Object o : inputs){
				System.out.println(">> "+o);
			}
			
			Product p = (Product)beanRef; // We got reference to our Product Object
			System.out.println(">> PostProcessing for "+p.getName());
		}
	}
}
