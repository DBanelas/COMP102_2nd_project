import java.util.Vector;

public abstract class Passenger extends Vehicle {
	
	private int maxPeople;
	private int CC;
	
	
	
	public Passenger(String licensePlate, String brandModel, int launchYear, double rentingPrice, int mileage,
			 int maxPeople, int CC) {
		super(licensePlate, brandModel, launchYear, rentingPrice, mileage);
		this.maxPeople=maxPeople;
		this.CC=CC;
	}



	public int getMaxPeople() {
		return maxPeople;
	}



	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}



	public int getCC() {
		return CC;
	}



	public void setCC(int cC) {
		CC = cC;
	}


}
