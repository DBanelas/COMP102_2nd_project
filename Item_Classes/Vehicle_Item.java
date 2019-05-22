import PLH102_LAB_09.src.tuc.ece.cs102.list.Item;

public class Vehicle_Item extends Item {
	
	private Vehicle vehicle;
	
	public Vehicle_Item(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	

	@Override
	public boolean equals(Item k) {
		return key().equals(k.key());
		
	}

	@Override
	public boolean less(Item k) {
		if (((String) key()).compareTo((String) k.key()) < 0)
			return true;
		return false;
	}

	@Override
	public Object key() {
		return vehicle.getLicensePlate();
		
	}

	@Override
	public void print() {
		vehicle.print();
		
	}

	@Override
	public Object getData() {
		return this.vehicle;
	}

}
