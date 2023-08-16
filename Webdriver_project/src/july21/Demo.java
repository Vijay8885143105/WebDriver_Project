package july21;

public class Demo {
public static void add(int x,int y)
{
	int z=x+y;
	System.out.println(z);
}
public static String verify_String(String str1,String str2)
{
	String res = "";
	if(str1.equalsIgnoreCase(str2))
	{
       res = "Strings are equal";
	}
	else
	{
		res = "Strings are not equal";
	}
	return res;
}
public static boolean compare_values(int a,int b)
{
	if(a==b)
	{
		return true;
	}
	else
	{
		return false;			
	}
}
	public static void main(String[] args) {
		Demo.add(7765, 8769);
		String res =Demo.verify_String("raining", "raining");
		System.out.println(res);
		boolean x=Demo.compare_values(124, 124);
		System.out.println(x);
		

	}

}
