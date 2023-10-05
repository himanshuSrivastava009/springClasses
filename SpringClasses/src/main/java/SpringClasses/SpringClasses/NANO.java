package SpringClasses.SpringClasses;

public class NANO implements Car{

	private RocketEngine rocketEngine;
	
	
	public NANO(RocketEngine rocketEngine) {
		super();
		this.rocketEngine = rocketEngine;
	}

	@Override
	public String getCarDetails() {

		return "NANO";
	}

	@Override
	public String getRocketEngineDetails() {
		// TODO Auto-generated method stub
		return rocketEngine.getRocketEngineDetails();
	}

	
}
