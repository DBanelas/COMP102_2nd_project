import java.util.Vector;

public class Trucks extends Vehicle {
	
	
	private int maxLoad;
	private double width;
	private double height;
	
	public Trucks(String licensePlate, String brandModel, int launchYear, double rentingPrice, int mileage,
					int maxLoad, double height, double width) {
		super(licensePlate, brandModel, launchYear, rentingPrice, mileage);
		this.maxLoad=maxLoad;
		this.height=height;
		this.width=width;
		
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println(this.toString());
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "Trucks" +"\n"+"maxLoad=" + maxLoad  +"\n"+ "width=" + width  +"\n"+ "height=" + height +"\n"+ "LicensePlate="
				+ getLicensePlate()  +"\n"+ "BrandModel=" + getBrandModel()  +"\n"+ "LaunchYear=" + getLaunchYear()
				 +"\n"+ "RentingPrice=" + getRentingPrice()  +"\n"+ "Mileage=" + getMileage()  +"\n"+ "Class="
				+ getClass() ;
	}
	
	
	
	
	

}
