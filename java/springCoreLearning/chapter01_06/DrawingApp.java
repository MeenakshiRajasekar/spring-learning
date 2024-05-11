package springCoreLearning.chapter01_06;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
public static void main(String[] args) {
	
//	BeanFactory beanFactory = new XmlBeanFactory(FileSystemResource("path")); deprecated
	
	ApplicationContext context = new ClassPathXmlApplicationContext("chapter01_06/spring.xml");

	Triangle object = (Triangle) context.getBean("triangle");
	object.draw();
}
	
}
