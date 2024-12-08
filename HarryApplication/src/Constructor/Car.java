package Constructor;


public class Car {
	
	String model;
	String colour;
	int cost;
	int mileage;
	
	public Car(String model,String colour,int cost,int mileage) 
	{
		this.model=model;
		this.colour=colour;
		this.cost=cost;
		this.mileage=mileage;
		
		
	}
	
	public void startCar() {
		
		System.out.println("Car has been started :" +model);
	}
	
	public void stopCar() {
		
		System.out.println("Car has been stopped :" +model);
	}
	
	public void carDetails() {
		
		System.out.println("Model of the car is " +model);
		System.out.println("Colour of the car is"+colour);
		System.out.println("Cost of the car is "+cost);
		System.out.println("mileage of the car is "+mileage);
	}

}
