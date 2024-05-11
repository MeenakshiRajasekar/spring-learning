package springCoreLearning.chapter07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter08/spring.xml");
		Triangle triangle = (Triangle) context.getBean("triange");
		triangle.draw();
	}
	

}
