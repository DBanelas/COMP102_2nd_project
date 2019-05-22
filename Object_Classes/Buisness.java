import java.util.Vector;

public class Buisness extends Clients {
	
	private double discount;

	public Buisness(String fullName, String AFM, String phoneNumber, String cityOfResidence, String countryOfResidence, double discount) {
		super(fullName, AFM, phoneNumber, cityOfResidence, countryOfResidence);
		this.discount=discount;
		
	}
	
	

	public double getDiscount() {
		return discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}



	@Override
	public void print() {
		
		System.out.println(this.toString());
	}



	@Override
	public String toString() {
		return "Buisness" +"\n"+ "discount=" + discount  +"\n"+ "FullName="
				+ getFullName() +"\n"+ "AFM=" + getAFM() +"\n"+ "PhoneNumber=" + getPhoneNumber()
				+"\n"+ "CityOfResidence=" + getCityOfResidence() +"\n"+ "CountryOfResidence="
				+ getCountryOfResidence() +"\n" ;
	
	
	

}
}