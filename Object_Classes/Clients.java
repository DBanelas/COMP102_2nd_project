import java.util.Vector;

public abstract class Clients {
	
	private String fullName;
	private String AFM;
	private String phoneNumber;
	private String cityOfResidence;
	private String countryOfResidence;
	
	
	
	public Clients(String fullName, String AFM, String phoneNumber, String cityOfResidence, String countryOfResidence
			) {
		super();
		this.fullName = fullName;
		this.AFM = AFM;
		this.phoneNumber = phoneNumber;
		this.cityOfResidence = cityOfResidence;
		this.countryOfResidence = countryOfResidence;
		
	}
	
	public abstract void print();


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getAFM() {
		return AFM;
	}


	public void setAFM(String aFM) {
		AFM = aFM;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCityOfResidence() {
		return cityOfResidence;
	}


	public void setCityOfResidence(String cityOfResidence) {
		this.cityOfResidence = cityOfResidence;
	}


	public String getCountryOfResidence() {
		return countryOfResidence;
	}


	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

}
