
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	public float totalCost = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered < 20) {
			this.itemsOrdered[qtyOrdered] = disc;
			this.qtyOrdered++;
			System.out.println("New disc has been added. \n");
		} else {
			System.out.println(" The cart is almost full\n");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvdList []) {
		for(int i = 0; i < dvdList.length ; i++) {
			if(this.qtyOrdered < 20) {
				this.itemsOrdered[qtyOrdered] = dvdList[i];
				this.qtyOrdered++;
				System.out.println("New disc has been added. \n");
			} else {
				System.out.println(" The cart is almost full\n");
			}
		}
	}
	
	
//	
	
	
	public float totalCost() {
		for(int i = 0; i< this.qtyOrdered; i++) {
			this.totalCost = this.totalCost + this.itemsOrdered[i].getCost();
		}
		return this.totalCost;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0 ; i < this.qtyOrdered ; i++) {
			if(this.itemsOrdered[i].equals(disc)) {
				this.itemsOrdered[i]= this.itemsOrdered[i+1];
			}
		}
		qtyOrdered--;
	}
	
	
	
	
	
}
