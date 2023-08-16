package july21;

public class Sample {
int x,y,z;//non static global variables
public void add()
{
	x=243;
	y=543;
	z=x+y;
	System.out.println(z);
}
public void div()
{
	x=256;
    y=4;
    z=x/y;
    System.out.println(z);
}
	public static void main(String[] args) {
		//creating reference object to call non static methods 
		Sample x=new Sample();
		x.add();
		Sample y=new Sample();
        y.div();
	
	}
	
}
		

	


