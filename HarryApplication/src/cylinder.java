
public class cylinder {
	
	int radius;
	int height;
	
	public  int getradius()
	{
		return radius;
	}
	
	public void setradius(int radius)
	{
		this.radius =radius;
		}
	public  int getheight()
	{
		return height;
	}
	
	public void setheight(int height)
	{
		this.height =height;
		}
	
	public double surfacearea()
	{
		return (2 * 3.1415 * radius * height) + (2 * 3.1415*radius* radius );
	}
	
	public double volume()
	{
		return 3.1415 * radius* radius * height ;
	}
	
	public cylinder (int radius ,int height)
	{
		this.radius= radius;
		this.height= height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cylinder c = new cylinder(8,10);
	   // c.setradius(8);
	   // c.setheight(10);
	    System.out.println(c.getradius());
		System.out.println(c.getheight());
		System.out.println(c.surfacearea());
		System.out.println(c.volume());
	}

}
