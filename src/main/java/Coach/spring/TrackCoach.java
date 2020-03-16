package Coach.spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Track Coach says no practice since "+fortuneService.getFortune();
	}

}

