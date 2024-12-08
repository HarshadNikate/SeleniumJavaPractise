
class rectangle{
	
	int length;
	int width;
	
	public int area()
	{
		return length*width;
	}
	
	public int perimeter()
	{
		return  2*(length + width);
	}
}


public class areaofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r = new rectangle();
		r.length= 5;
		r.width=4;
		System.out.println(r.area());
		System.out.println(r.perimeter());

	}

}
