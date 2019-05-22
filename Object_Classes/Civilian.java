import java.util.Vector;

public class Civilian extends Clients {

	public Civilian(String fullName, String  AFM, String phoneNumber, String cityOfResidence, String countryOfResidence) {
		super(fullName,AFM, phoneNumber, cityOfResidence, countryOfResidence);
		
	}

	@Override
	public void print() {
		System.out.println(this.toString());
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "Civilian" +"\n"+ "FullName=" + getFullName()  +"\n"+ "AFM=" + getAFM()  +"\n"+ "PhoneNumber="
				+ getPhoneNumber()  +"\n"+ "CityOfResidence=" + getCityOfResidence()  +"\n"+ "CountryOfResidence="
				+ getCountryOfResidence()  +"\n"+ "Class()=" + getClass();
	
}
}
