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
		BaseballCoach coach1 = context.getBean("BaseballCoach", BaseballCoach.class);
		Coach coach2 = context.getBean("TrackCoach", Coach.class);
		// call methods on the bean
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getEmailId());
		System.out.println(coach1.getTeam());
		System.out.println(coach2.getDailyFortune());
		// close the context
		context.close();
	}
}
