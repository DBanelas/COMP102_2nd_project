import PLH102_LAB_09.src.tuc.ece.cs102.list.Item;

public class Client_Item extends Item {
	private Clients client;
	
	
	
	public Client_Item(Clients client) {
		this.client=client;
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
		return client.getAFM();
	}

	@Override
	public void print() {
		client.print();
		
	}

	@Override
	public Object getData() {
		return this.client;

}
}
