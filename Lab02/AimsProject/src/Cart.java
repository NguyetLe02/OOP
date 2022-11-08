
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered < 20) {
			this.itemsOrdered[qtyOrdered] = disc;
			this.qtyOrdered++;
			System.out.println("New disc has been added. \n");
		} else {
			System.out.println(" The cart is almost full\n");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
	}
	
	
	
}
