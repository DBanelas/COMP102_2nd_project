import java.util.Date;

public class Rentals {
	

	private  int code;
	private Clients client;
	private Vehicle vehicle;
	private Date rentingStart;
	private Date rentingEnd;
	private double fullPrice;
	
	
	
	public Rentals(int code, Clients client, Vehicle vehicle, Date rentingStart, Date rentingEnd, double fullPrice) {
		super();
		this.client = client;
		this.vehicle = vehicle;
		this.rentingStart = rentingStart;
		this.rentingEnd = rentingEnd;
		this.fullPrice = fullPrice;
		this.code=code;
	}
	
	public void print() {
		
		System.out.println(this.toString());
		try {
			if(Class.forName("Buisness").isInstance(this.client)) {
				Buisness tCl=(Buisness)this.client;
				System.out.println("Discount: "+tCl.getDiscount()*100+ "%");
			}
		} catch (ClassNotFoundException e) {
			System.out.print("Something went wrong");
	}
		System.out.println();
}
	

	@Override
	public String toString() {
		return "Rentals" +"\n"+"client=" + client.getFullName() +"\n"+"Vehicle" + vehicle.getBrandModel() +"\n"+ "License plate=" + vehicle.getLicensePlate() +"\n"+ "rentingStart=" + rentingStart.toString() +"\n"+ "rentingEnd="
				+ rentingEnd.toString() +"\n"+ "fullPrice=" + fullPrice;
	}

	public  int getCode() {
		return this.code;
	}



	public  void setCode(int code) {
		this.code = code;
	}



	public Clients getClient() {
		return client;
	}



	public void setClient(Clients client) {
		this.client = client;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



	public Date getRentingStart() {
		return rentingStart;
	}



	public void setRentingStart(Date rentingStart) {
		this.rentingStart = rentingStart;
	}



	public Date getRentingEnd() {
		return rentingEnd;
	}



	public void setRentingEnd(Date rentingEnd) {
		this.rentingEnd = rentingEnd;
	}



	public double getFullPrice() {
		return fullPrice;
	}



	public void setFullPrice(double fullPrice) {
		this.fullPrice = fullPrice;
	}
	
}
