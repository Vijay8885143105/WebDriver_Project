package july21;

public class Vijji {
static int x,y,z;//static global variables
public static void mult()
{
	  x=3546;
	  y=2345;
	  z=x*y;
	  System.out.println(z);
}
public static void sub()
{
	x=56743;
	y=34623;
    z=x-y;
   System.out.println(z);
}
	public static void main(String[] args) {
		//calling  static methods with class name
		Vijji.mult();
		//vijji.sub();
		

	}

}
