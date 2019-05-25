package co.edureka.main;

// import org.springframework.aop.framework.ProxyFactoryBean; -> Configure this API in beans.xml
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Product;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Product product = context.getBean("pRef",Product.class);
		//System.out.println(product);
		
		Product product = context.getBean("pRefProxy",Product.class);
		product.purchaseProduct("Pristine Magnum, Bnglr", "Evening", "Net Banking");

		
	}

}
