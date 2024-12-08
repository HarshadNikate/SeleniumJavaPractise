

class animal{
	
	void eat()
	{
		System.out.println("dog is eating");
	}
}

class dog extends animal{
	
	void bark()
	{
		System.out.println("dog is barking");
	}

}



public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		dog d = new dog();
		d.bark();
		d.eat();
		
	}

}
