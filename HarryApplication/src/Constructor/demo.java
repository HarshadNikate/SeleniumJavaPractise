package Constructor;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car bmw= new Car("bmw","red",15000,25);
		Car audi= new Car("audi","blue",20000,15);
		Car tata= new Car("tata","black",10000,35);
		
		
		bmw.startCar();
		bmw.stopCar();
		bmw.carDetails();
		
System.out.println("---------------------------------------------------------------");		
		
		audi.startCar();
		audi.stopCar();
		audi.carDetails();
		
		System.out.println("---------------------------------------------------------------");
		
		tata.startCar();
		tata.stopCar();
		tata.carDetails();
	}

}
