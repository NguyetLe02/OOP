package hust.soict.dsai.aims.media;

public abstract class Media extends  Object {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	public Media() {
		super();
	}
	
	public static void main(String[] args) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
