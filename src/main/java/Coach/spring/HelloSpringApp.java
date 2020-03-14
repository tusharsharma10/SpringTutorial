package Coach.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp  {
	public static void main(String[] args) {

		/**
		 *  Step 2: Creating the container
		 */
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		/**
		 * Step 3: Retrieve bean from spring container
		 */
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}
