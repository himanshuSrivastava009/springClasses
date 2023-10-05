package SpringClasses.SpringClasses;

public class Audi implements Car {

	private RocketEngine rocketEngine;
	private String color;
	private String price;
	@Override
	public String getCarDetails() {
		
		return "Audi";
	}

	@Override
	public String getRocketEngineDetails() {
		
		return rocketEngine.getRocketEngineDetails();
	}

	public RocketEngine getRocketEngine() {
		return rocketEngine;
	}

	public void setRocketEngine(RocketEngine rocketEngine) {
		this.rocketEngine = rocketEngine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	
}
