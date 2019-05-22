import PLH102_LAB_09.src.tuc.ece.cs102.list.Item;

public class Rentals_Item extends Item {
	
	Rentals rental;
	
	public Rentals_Item(Rentals rental) {
		
		this.rental=rental;
	}

	@Override
	public boolean equals(Item k) {
		
		return key().equals(k.key());
	}

	@Override
	public boolean less(Item k) {
		if (((Integer) key()).compareTo((Integer) k.key()) < 0)
			return true;
		return false;
	}

	@Override
	public Object key() {
		return rental.getCode();
	}

	@Override
	public void print() {
		rental.print();
		
	}

	@Override
	public Object getData() {
		return this.rental;
	}

}
