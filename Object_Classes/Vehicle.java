import java.util.Vector;

public abstract class Vehicle {
	
	private String  licensePlate;
	private String BrandModel;
	private int launchYear;
	private double rentingPrice;
	private int mileage;
	
	
	
	public Vehicle(String licensePlate, String brandModel, int launchYear, double rentingPrice, int mileage) {
		super();
		this.licensePlate = licensePlate;
		BrandModel = brandModel;
		this.launchYear = launchYear;
		this.rentingPrice = rentingPrice;
		this.mileage = mileage;
		
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	public String getBrandModel() {
		return BrandModel;
	}


	public void setBrandModel(String brandModel) {
		BrandModel = brandModel;
	}


	public int getLaunchYear() {
		return launchYear;
	}


	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}


	public double getRentingPrice() {
		return rentingPrice;
	}


	public void setRentingPrice(double rentingPrice) {
		this.rentingPrice = rentingPrice;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public abstract void print(); 
	
	public  String getUse() {
		
		return null;
	}
		
	
	
	
	

}
