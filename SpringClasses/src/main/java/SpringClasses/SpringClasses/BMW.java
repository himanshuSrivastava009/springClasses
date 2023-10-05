package SpringClasses.SpringClasses;

public class BMW implements Car{

	private RocketEngine rocketEngine;
	
	public BMW(RocketEngine rocketEngine) {
		super();
		this.rocketEngine = rocketEngine;
	}

	
	@Override
	public String getCarDetails() {
		
		return "BMW";
	}

	@Override
	public String getRocketEngineDetails() {
		
		return rocketEngine.getRocketEngineDetails();
	}

	
}
