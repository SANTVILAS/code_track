package Interface_segmented_principal;

public interface RestaurantEmployee {

	void washDishes();

	void serveCustomer();

	void cookFood();

}

class waiter implements RestaurantEmployee{
	
	

	//here waiter will not washDish And cook food
	
	//so so create waiterInface seperate and have only include mandatory methods
	
	@Override
	public void washDishes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serveCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cookFood() {
		// TODO Auto-generated method stub
		
	}
	
	
}
