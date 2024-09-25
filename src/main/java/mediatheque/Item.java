package mediatheque;

public abstract class Item {
	private String title;

	protected Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void print();

	@Override
	public String toString() {
		return title;
	}

	public MediathequeVisitor mediatheque ; 
	public MediathequeVisitor accetp (MediathequeVisitor mediatheque) { 
		return mediatheque ; 
	}	
	
}
