package single_responsibility_principal;

public class Invoice {

	private Marker marker;
	private int quatity;
	
	
	public Invoice(Marker marker, int quatity) {
		super();
		this.marker = marker;
		this.quatity = quatity;
	}
	
    public int calculateTotal() {
    	int price=((marker.price) * this.quatity);
    	return price;
    }	
    
    //if you write below two method that will not follow Single responsibility Pricipal so that is why created seperate class
    //for each method, so everything loosely coupled.just bc of you need to change in calulation logic . other two method gone impacted 
    //so better to crate seperate class with specific implementation
	/*
	 * public void saveToDB() {
	 * 
	 * }
	 * 
	 * public void printInvoice() {
	 * 
	 * }
	 */
}
