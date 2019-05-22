import java.util.Vector;

public class Car extends Passenger {
	
	
	private int doors;
	private CarFeatures carfeature;
	private String use;
	
	public Car(String licensePlate, String brandModel, int launchYear, double rentingPrice, int mileage,
			 int maxPeople, int CC, int doors, CarFeatures feature1) {
		super(licensePlate, brandModel, launchYear, rentingPrice, mileage, maxPeople, CC);
		this.doors=doors;
		
		
		if(feature1!=null) {
			this.carfeature=feature1;
		}
		
		if(maxPeople>7) {
			
			use="DX";
		}
		else {
			use="IX";
		}
		
		
	}
	
	
	

	public int getDoors() {
		return doors;
	}




	public void setDoors(int doors) {
		this.doors = doors;
	}




	public CarFeatures getCarfeature() {
		return carfeature;
	}




	public void setCarfeature(CarFeatures carfeature) {
		this.carfeature = carfeature;
	}



	@Override
	public String getUse() {
		return use;
	}




	public void setUse(String use) {
		this.use = use;
	}



	@Override
	public void print() {
			System.out.println(this.toString());
			System.out.println();
	}




	@Override
	public String toString() {
		return "Car" +"\n"+ "doors=" + doors +"\n"+ "carfeature=" + carfeature +"\n"+ "use=" + use +"\n"
				+ "max people="
				+ getMaxPeople() +"\n"+  "CC=" + getCC()  +"\n"+ "LicensePlate=" + getLicensePlate()
				 +"\n"+ "BrandModel=" + getBrandModel()  +"\n"+ "LaunchYear=" + getLaunchYear()
				 +"\n"+ "RentingPrice=" +getRentingPrice()  +"\n"+ "Mileage=" + getMileage()  ;
	}
	
	
	

}
