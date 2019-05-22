import java.util.Vector;

public class Bike extends Passenger {
	
	

	private BikeFeatures bikefeature;
	
	
	
	public Bike(String licensePlate, String brandModel, int launchYear, double rentingPrice, int mileage
			 , int maxPeople, int CC, BikeFeatures feature1) {
		super(licensePlate, brandModel, launchYear, rentingPrice, mileage, maxPeople, CC);
		
		
		if(feature1!=null) {
			this.bikefeature=(feature1);
		}
		
	}
	
	public BikeFeatures getBikefeature() {
		return bikefeature;
	}


	public void setBikefeature(BikeFeatures bikefeature) {
		this.bikefeature = bikefeature;
	}


	@Override
	public void print() {
		
		System.out.println(this.toString());
		System.out.println();
	}


	@Override
	public String toString() {
		return "Bike"  +"\n"+ "bikefeature=" + bikefeature +"\n"+ "MaxPeople="
				+ getMaxPeople() +"\n"+ "CC=" + getCC()+"\n"+ "LicensePlate=" + getLicensePlate()
				+"\n"+ "BrandModel=" + getBrandModel() +"\n"+ "LaunchYear=" + getLaunchYear()
				+"\n"+ "RentingPrice" + getRentingPrice() +"\n"+ "Mileage=" + getMileage()+"\n"+ "getClass()="
				+ getClass();
	}


}
