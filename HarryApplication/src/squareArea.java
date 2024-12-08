
class square{
	
	int side;
	
	public int area()
	{
		return side*side;
	}
	
	public int perimeter()
	{
		return 4*side;
	}
	
	
	
}


public class squareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square s=new square();
		s.side=3;
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}

}
