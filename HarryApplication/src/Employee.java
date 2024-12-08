
  class student {
	  int salary;
	  String name;
	  
	public int  getsalary()
	  {
		  return salary;
	  }
		  
	public String getname()
	 {
		 return name;
	 }
	
	public void setname(String n)
	{
		name=n;
	
	}
	
}



public class Employee {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		student s= new student();
		s.setname("harrybhai");
		System.out.println(s.getname());
		s.salary= 20000;
		System.out.println(s.getsalary());
	}
	

}
