import PLH102_LAB_09.src.tuc.ece.cs102.list.EnhancedSortedList;
import PLH102_LAB_09.src.tuc.ece.cs102.list.Item;
import tuc.ece.cs102.util.StandardInputRead;
import java.util.Date;
import tuc.ece.cs102.util.DatePeriod;


public class Company {
	
	private String Name;
	private String  afm;
	private String hometown;
	private EnhancedSortedList vehicles;
	private EnhancedSortedList clients;
	private EnhancedSortedList rentals;
	
	
	
	@SuppressWarnings("deprecation")
	public Company(String name, String afm, String hometown) {
		super();
		this.Name = name;
		this.afm = afm;
		this.hometown = hometown;
		
		vehicles= new EnhancedSortedList();
		clients= new EnhancedSortedList();
		rentals= new EnhancedSortedList();
		
		
		Vehicle c1=new Car("XNK5544", "Mercedes C200", 2012, 50 ,120000, 5, 1800, 4, CarFeatures.BATTERY);
		Vehicle c2=new Car("XNA1204", "Honda Pilot", 2019, 70, 5000, 7, 3000,5, CarFeatures.DIESEL);
		Vehicle c3=new Car("XNM1345", "Mercedes MiniBXS", 2018, 100,6000, 12, 1200, 4, CarFeatures.DIESEL);
		Vehicle b1=new Bike("XNO1706","Yamaha YZF-R3", 2015, 45, 60500, 2, 600, BikeFeatures.TOURING);
		Vehicle b2=new Bike("XNO9901","Kawasaki Ninja 300", 2012, 30, 32000, 2, 00, BikeFeatures.CRUISING);
		Vehicle t1=new Trucks("XNA1207", "Volvo FH16", 2017, 90000, 250, 20000, 4, 3);
		Vehicle t2=new Trucks("XNA1208", "Scania XD1", 2018, 80000, 300, 25000, 3, 3);
		
		Clients cl1=new Civilian("Nikos Arabatzis", "123456789", "3028210373", "Chania", "Greece");
		Clients cl2=new Civilian("Johanes Stevenson", "987654321", "3536975589", "Stockholm", "Sweden");
		Clients bu1=new Buisness("Nick Malone", "741258963", "3536975589", "Dublin", "Ireland", 0.1);
		Clients bu2=new Buisness("Tim Roberg", "258963147", "3265738648", "Brussels", "Belgium", 0.2);
		
		
		//Inserting vehicles in the list
		vehicles.insert(new Vehicle_Item(c1));
		vehicles.insert(new Vehicle_Item(c2));
		vehicles.insert(new Vehicle_Item(c3));
		vehicles.insert(new Vehicle_Item(b1));
		vehicles.insert(new Vehicle_Item(b2));
		vehicles.insert(new Vehicle_Item(t1));
		vehicles.insert(new Vehicle_Item(t2));
		
		//Inserting clients in the list
		clients.insert(new Client_Item(cl1));
		clients.insert(new Client_Item(cl2));
		clients.insert(new Client_Item(bu1));
		clients.insert(new Client_Item(bu2));
		
		//Inserting some Rentals in the list
		rentals.insert(new Rentals_Item(new Rentals(100,cl1, c1, new Date("2019/04/03"), new Date("2019/04/22"), 950.0)));
		rentals.insert(new Rentals_Item(new Rentals(101,cl2, c2, new Date("2019/04/05"), new Date ("2019/04/08"),210.0)));
		rentals.insert(new Rentals_Item(new Rentals(102,bu1, b1, new Date("2019/06/05"), new Date("2019/06/15"), 405)));
		rentals.insert(new Rentals_Item(new Rentals(103,bu2, b2, new Date("2019/06/05"), new Date("2019/06/15"), 240)));
		rentals.insert(new Rentals_Item(new Rentals(104,cl1, t1, new Date("2019/06/05"), new Date("2019/06/14"), 2250)));
		rentals.insert(new Rentals_Item(new Rentals(105,cl2, t2, new Date("2019/06/07"), new Date("2019/06/15"), 2400)));
		rentals.insert(new Rentals_Item(new Rentals(106,bu1, c1, new Date("2019/06/05"), new Date("2019/06/15"), 450)));
		rentals.insert(new Rentals_Item(new Rentals(107,bu2, c3, new Date("2019/08/05"), new Date("2019/08/15"), 800)));
		
		
	}
	
	

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAfm() {
		return afm;
	}


	public void setAfm(String afm) {
		this.afm = afm;
	}


	public String getHometown() {
		return hometown;
	}


	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	
	///Prints specific vehicle
	public void searchAndPrintVehicleWithPlate(String lPlate){
		
		
		Item v=vehicles.search(lPlate);
		
		if(v==null) {
			
			System.out.println("the car u entered does not exist");
		}
		else {
			v.print();
		}	
		
	}
	///Deletes vehicle using delete method from sorted list
	public void deleteVehicle(String lPlate) {
		
		Item v=vehicles.search(lPlate);
		
		if(v==null) {
			
			System.out.println("the car u entered does not exist");
		}
		else {
			vehicles.delete(v);		
		}	
		
		
	}
	//Prints specific client
	public void searchAndPrintClientWithAFM(String AFM) {
		
		Item c=clients.search(AFM);
		
		if(c==null) {
			System.out.println("the client u entered does not exist");
		}
		else {
			c.print();
		}
			
	}
	//Deletes client using delete method from sorted list
	public void deleteClient(String AFM) {
		
		Item c=clients.search(AFM);
		
		if(c==null) {
			System.out.println("the client u entered does not exist");
		}
		else {
			clients.delete(c);
		}
	}
	///Prints all vehicles
	public void printVehicleFleet() {
		
		vehicles.print();
		
	}
	
	//prints vehicles by Class
	public void printCategoryVehicle(String ClassName){
		
		vehicles.printItemsInHierarchy(ClassName);
		
	}
	
	
	
	///Adds a new rental
	public void addNewRenting() {
		
		StandardInputRead input=new StandardInputRead();
		String afm;
		int periodFlag=0, choice, discount, code=108;
		int carFlag=0;
		double dailyCost=0, finalCost=0;
				
	
		afm=input.readString("enter the client's afm: ");
		
		///Checks if client exists
		if(clients.search(afm)!=null) {
			String lplate;
			Clients cl=(Clients)clients.search(afm).getData();
			
			lplate=input.readString("enter the vehicle's license plate: ");
			///Checks if vehicle exists
				if(vehicles.search(lplate)!=null) {
					
					Vehicle v=(Vehicle)vehicles.search(lplate).getData();
					 	
					try {
						//Doesnt let a civilian rent a public use car
					if(Class.forName("Civilian").isInstance(cl)==true && Class.forName("Car").isInstance(v)==true && v.getUse().equals("DX")) {
							
							System.out.println("a civilian cannot rent a DX car");
							return;
							
						}
					} catch (ClassNotFoundException e) {
						
						System.out.print("something went wrong");
					}
					Date rStart=input.readDate("Rental start date in dd/mm/yyy format: ");
					Date rEnd=input.readDate("Rental end date in dd/mm/yyy format: ");
					DatePeriod userPeriod= new DatePeriod(rStart, rEnd);
					///Checks if the vehicle is already rented for the period the client wants
					for(int i=100; i<(100+rentals.getLength()); i++) {
						int k=i;
						
						if(rentals.searchForRentals(k)!=null){
						Rentals r=(Rentals)rentals.searchForRentals(k).getData();
						
							if(v.equals(r.getVehicle())==true) {
								carFlag++;
								DatePeriod carPeriod=new DatePeriod(r.getRentingStart(), r.getRentingEnd());
									if(carPeriod.overlaps(userPeriod)==false)
										{
											periodFlag++;
										}
							}
						}
					}
					
					if(carFlag==periodFlag) {
						dailyCost=v.getRentingPrice();
						
						try {
							if(Class.forName("Buisness").isInstance(cl)==true) {
								
								 Buisness tCl=(Buisness)cl;
								//Computes cost with discount(only for buisness)
								finalCost=dailyCost*userPeriod.toDays()-((Buisness) tCl).getDiscount()*dailyCost;
								
							}
							else {
								//computes cost without discount
								finalCost=dailyCost*userPeriod.toDays();
							}
							//Adds rental using insert method from enhanced sorted list
							rentals.insert(new Rentals_Item(new Rentals(code, cl,v, rStart, rEnd, finalCost)));
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.print("the rentings has been added in the rentlas list");
						code++;
						return;
						
						
					}else {
						System.out.print("the vehicle u want is already rented for the period u want");
						return;
					}
						
				}else {
					System.out.print("the vehicle u entered does not exist");
					return;
				}
		}else {
			System.out.print("the client u entered does not exist");
			return;
			
		}
	}

	///Prints rentals for a specific vehicle
public void printRentalsByVehicle() {
	
	String lplate;
	
	StandardInputRead input=new StandardInputRead();
	
	lplate=input.readString("Enter the vehicle's license plate");
	
	if(vehicles.search(lplate)!=null) {
		
		Vehicle v=(Vehicle)vehicles.search(lplate).getData();
		///goes through rentals list
		for(int i=100; i<100+rentals.getLength(); i++) {
			int k=i;
			if(rentals.searchForRentals(k)!=null) {
				
				Rentals r=(Rentals)rentals.searchForRentals(k).getData();
				//checks if the vehicle exists in each rental
				if(v.equals(r.getVehicle())==true) {
					///prints
					r.print();
				}
			}
		}
	}else {
		System.out.print("the vehicle u entered does not exist");
		
	}
}

///Prints rentals for a specific client
public void printRentalsByClient() {
	String AFM;
	StandardInputRead input=new StandardInputRead();
	AFM=input.readString("Enter the client's AFM");
	if(clients.search(AFM)!=null) {
		
		Clients cl=(Clients)clients.search(AFM).getData();
		///goes through rentals list
		for(int i=100; i<100+rentals.getLength(); i++) {
			int k=i;
			if(rentals.searchForRentals(k)!=null) {
				
				Rentals r=(Rentals)rentals.searchForRentals(k).getData();
				///checks if the client exists in any of the rentals
				if(cl.equals(r.getClient())==true) {
					///prints
					 r.print();
				}
			}
			
		}
		
	}else {
		System.out.print("the client u entered dos not exist");
	}
	
}

///Prints Rentals by Time period
public void printRentalsByDatePeriod() {
	
	StandardInputRead input=new StandardInputRead();
	Date rStart=input.readDate("Enter the Renting's start");
	Date rEnd=input.readDate("Enter the renting's end");
	///goes through rentals list
	for(int i=100; i<100+rentals.getLength(); i++) {
		int k=i;
		
		
		if(rentals.searchForRentals(k)!=null) {
			
			Rentals r=(Rentals)rentals.searchForRentals(k).getData();
			///Checks the renting if the renting period is within the user's period margins
			if(rStart.compareTo(r.getRentingStart())==0 || rEnd.compareTo(r.getRentingEnd())==0
			||r.getRentingStart().after(rStart)==true && r.getRentingEnd().before(rEnd)==true) {
				
				r.print();
			}
		}
	}
}
///Method to add a new vehicle
public void addNewVehicle() {
	
	StandardInputRead input=new StandardInputRead();
	
	System.out.println("1.) Car");
	System.out.println("2.) Bike");
	System.out.println("3.) Truck");
	int Type=input.readPositiveInt("What type of vehicle do u want to enter?");
	
	
	String lplate=input.readString("Enter the vehicle's license plate: ");
	//Checks if the vehicle already exists.
	if(vehicles.search(lplate)!=null) {
		
		System.out.println("There already exists a vehicle with that car plate, returning to main menu. ");
		return;
	}
	
	
	String brandModel=input.readString("Enter the brand and the model of the vehicle in the format brand model: ");
	
	double rentingPrice=(double)input.readPositiveFloat("Enter the price/day for the vehicle: ");
	int launchYear=input.readPositiveInt("Enter the vehicle's lunch year: ");
	int mileage=input.readPositiveInt("Enter the distance that the vehicle has been driven");
	
	
	
	 switch(Type) {
	 ///Adds a car
	  case 1:
		  
		   int CC=input.readPositiveInt("Enter the car's cc: ");
  		   int doors=input.readPositiveInt("Enter the number of doors: ");
  		   int maxPeople=input.readPositiveInt("Enter the max number of persons that fit in the car: ");
  		   
  		   System.out.println("1.) BATTERY");
			System.out.println("2.) DIESEL");
			System.out.println("3.) GAS");
			
  		   
		  int choice=input.readPositiveInt("Enter the car's energy source: ");
		  
			 switch(choice) {
       	  case 1:
       		  Vehicle v=new Car(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople, CC,doors, CarFeatures.BATTERY);
       		  vehicles.insert(new Vehicle_Item(v));
       		  System.out.println("The vehicle has been added!");
       		  break;
       	  case 2:
       		  
       		Vehicle c=new Car(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople, CC,doors, CarFeatures.DIESEL);
       		vehicles.insert(new Vehicle_Item(c));
       		System.out.println("The vehicle has been added!");
       		  break;
       	  case 3:
       		Vehicle d=new Car(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople, CC,doors, CarFeatures.GAS);
       		vehicles.insert(new Vehicle_Item(d));
       		System.out.println("The vehicle has been added!");
       		  break;
       		  
       	  default:
               System.out.println(Type + " is not a valid Menu Option! Returning to main menu.");  
	  
  }
			
			
		  break;
		///Adds a bike
	  case 2:
		  int CC1=input.readPositiveInt("Enter the bike's cc: ");
		  int maxPeople1=input.readPositiveInt("Enter the max number of persons that fit in the bike(3 persons max): ");
		  
		 
			System.out.println("1.) TOURING");
			System.out.println("2.) SPORT");
			System.out.println("3.) ON_OFF");
			System.out.println("4.) CRUISING");
			int choice1=input.readPositiveInt("Enter the bike's category: ");
		  
		  switch(choice1) {
       	  case 1:
       		  Vehicle v=new Bike(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople1, CC1, BikeFeatures.TOURING);
       		  vehicles.insert(new Vehicle_Item(v));
       		  System.out.println("The vehicle has been added!");
       		  break;
       	  case 2:
       		  
       		   Vehicle c=new Bike(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople1, CC1, BikeFeatures.SPORT);
       		   vehicles.insert(new Vehicle_Item(c));
       		   System.out.println("The vehicle has been added!");
       		  break;
       	  case 3:
       		  Vehicle d=new Bike(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople1, CC1, BikeFeatures.ON_OFF);
       		  vehicles.insert(new Vehicle_Item(d));
       		  System.out.println("The vehicle has been added!");
       	  case 4:
       		  Vehicle w =new Bike(lplate, brandModel, launchYear, rentingPrice, mileage, maxPeople1, CC1, BikeFeatures.CRUISING);
       		  vehicles.insert(new Vehicle_Item(w));
       		  System.out.println("The vehicle has been added!");
       		
       		  break;
       		  
       	   default:
               System.out.println(Type + " is not a valid Menu Option! Returning to main menu.");  
               break;
		  }
		  
		  break;
		///Adds a truck
	  case 3:
		    int maxLoad=input.readPositiveInt("Enter the truck's max load: ");
			double width=(double)input.readPositiveFloat("Enter the truck's width: ");
		    double height=(double)input.readPositiveFloat("Enter the truck's height: ");
		    
		    Vehicle v=new Trucks(lplate,brandModel, launchYear,rentingPrice,mileage,maxLoad, width,height);
		    
		    vehicles.insert(new Vehicle_Item(v));
		    System.out.println("The vehicle has been added!");
		    
		  break;
	
	  
	  default:
	            System.out.println(Type + " is not a valid Menu Option!  Returning to main menu.");  
	            break;
	            
	            
	  }
	 return;
}

public void addNewClient() {
	
	StandardInputRead input=new StandardInputRead();
	
	String fullName=input.readString("Enter the client's full name: ");
	
	
	 String AFM=input.readString("Enter the client's AFM: ");
	 ///Checks if the client already exists
	 if(clients.search(AFM)!=null) {
		 System.out.println("There already exists a client with that car AFM, returning to main menu. ");
			return;
		 
	 }
	 
	 
	 String phoneNumber=input.readString("Enter the client's phone number: ");
	 String cityOfResidence=input.readString("Enter the client's city of residence: ");
	 String countryOfResidence=input.readString("Enter the client's country of residence: ");
	 
	 
	 	System.out.println("1.) Civilian");
		System.out.println("2.) Buisness");
		
		int choice2=input.readPositiveInt("Enter the type of the client: ");
		
		switch(choice2) {
		///Adds a civilian
		case 1: 
			
			Clients cl=new Civilian(fullName, AFM, phoneNumber, cityOfResidence, countryOfResidence);
			clients.insert(new Client_Item(cl));
			System.out.println("The client has been added!");
			
			break;
	    ///Adds a Buisness
		case 2:
			double discount=(input.readPositiveInt("The discount will be x %. Enter x.The discount can be 0. "))/100;
			Clients cl1=new Buisness(fullName, AFM, phoneNumber,cityOfResidence, countryOfResidence, discount);
			clients.insert(new Client_Item(cl1));
			System.out.println("The client has been added!");
			break;
		default:
			System.out.println(choice2 + " is not a valid Menu Option! Returning to main menu.");  
            break;
		
		}
		
	
	
}

	
}



