///All choices must be valid.in case of an invalid option the programm returns to main menu.
import tuc.ece.cs102.util.StandardInputRead;

public class MyMain {

	private Company cp=new Company("dimitris", "afm", "greece");
	
	
	public static void main(String[] args) {
		
		
		 Company cp=new Company("dimitris", "afm", "greece");
		 
		 int choice;
		 
		 
		 
		 do {
		 mainMenu();
		 System.out.print("\nEnter Your Menu Choice: ");
		 
		 
		 StandardInputRead input=new StandardInputRead();
		 
		 choice=input.readPositiveInt(" ");	 
		 
		 
		 switch(choice) {
		 
		 
		 case 1:
			 String lplate=input.readString("enter the license plate of the vehicle");
			 cp.searchAndPrintVehicleWithPlate(lplate);
			 input.readString("Press any key to continue...");
			 break;
			 
		 case 2:
			 String lplate1=input.readString("enter the license plate of the vehicle");
			 cp.deleteVehicle(lplate1);
			 input.readString("Press any key to continue...");
			 break;
			 
		 case 3:
			 cp.printVehicleFleet();
			 input.readString("Press any key to continue...");
			 break;
			 
		 case 4:
			 VehicleCategory();
			 int choice2=input.readPositiveInt("Enter the category of the vehicles");
			 if(choice2>3) {
				 System.out.println("Invalid option, returnin to main menu");
				 break;
			 }
			 
			 switch(choice2) {
			 
			 case 1:
				 cp.printCategoryVehicle("Car");
				 input.readString("Press any key to continue...");
				 break;
				 
			 case 2:
				 cp.printCategoryVehicle("Bike");
				 input.readString("Press any key to continue...");
				 break;
			 case 3:
				 cp.printCategoryVehicle("Trucks");
				 input.readString("Press any key to continue...");
				 break;
			 default:
				 break;
			 }
			 break;
			 
		 case 5:
			 String AFM=input.readString("enter the client's AFM");
			 cp.searchAndPrintClientWithAFM(AFM);
			 input.readString("Press any key to continue...");
			 break;
		 case 6:
			 String AFM1=input.readString("enter the client's AFM");
			 cp.deleteClient(AFM1);
			 input.readString("Press any key to continue...");
			 break;
		 
		 case 7:
			 cp.addNewRenting();
			 input.readString("Press any key to continue...");
			 break;
		 case 8:
			
			 RentalsCategory();
			 int choice3=input.readPositiveInt("How do u want to search and print rentals? ");
			 if(choice3>3) {
				 System.out.println("Invalid option, returnin to main menu");
				 break;
			 }
			 
			 switch(choice3) {
			 
			 case 1:
				 cp.printRentalsByClient();
				 input.readString("Press any key to continue...");
				 break;
				 
			 case 2:
				 cp.printRentalsByVehicle();
				 input.readString("Press any key to continue...");
				 break;
				 
			 case 3:
				 cp.printRentalsByDatePeriod();
				 input.readString("Press any key to continue...");
				 break;
			 default:
				 break;
				 
			 }
			 break;
		 case 9:
			 cp.addNewVehicle();
			 input.readString("Press any key to continue...");
			 break;
		
		 case 10:
			 cp.addNewClient();
			 input.readString("Press any key to continue...");
			 break;
			 
		 default:
			 break;
		 }
		 
		 }while(choice!=11);
			 

}
	
private static void mainMenu()
{
	System.out.println("----------------MAIN MENU----------------");
	System.out.println("1.) Search and print a vehicle by its license plate.");
	System.out.println("2.) Delete a vehicle.");
	System.out.println("3.) Print vehicle fleet.");
	System.out.println("4.) Print vehicles by category.");
	System.out.println("5.) Search and print a client by their AFM.");
	System.out.println("6.) Delete Client");
	System.out.println("7.) Add a new rental.");
	System.out.println("8.) Print rentals.");
	System.out.println("9.) Add a new vehicle. ");
	System.out.println("10.) Add a new client. ");
	System.out.println("11.) Exit");
	
	
}

private static void VehicleCategory() {
	
	System.out.println("---------------Categories Menu----------------");
	System.out.println("1.) Car");
	System.out.println("2.) Bike");
	System.out.println("3.) Truck");
}

private static void RentalsCategory() {
	System.out.println("---------------Options----------------");
	System.out.println("1.) By Client");
	System.out.println("2.) By Vehicle");
	System.out.println("3.) By Time period");
	
}

}
