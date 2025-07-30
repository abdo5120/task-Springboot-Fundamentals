package spring_core_demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSCD
{
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		UserService userService = context.getBean(UserService.class);
		userService.performService("This is my Report..");
	}

}
