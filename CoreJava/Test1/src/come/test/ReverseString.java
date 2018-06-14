package come.test;

public class ReverseString
{
	String originalStr = null;
	public ReverseString()
	{
		originalStr="abcd";
	}
	public void reverseStringMth()
	{
		char ori[]=originalStr.toCharArray();
		for(int i=1;i<=ori.length;i++)
			System.out.print(ori[ori.length-i]);
		this.main(1);
	}
	public static void main(String args[])
	{
		ReverseString revStr = new ReverseString();
		revStr.reverseStringMth();
	}
	private static void main(int abs) {
		System.out.println("\nhi");
		NewInheritance test=new NewInheritance();
		//test.reverseStringMth();
		String args[] =  {"abc","tex"};
		NewInheritance.main(1);
	}
	
}
class NewInheritance extends ReverseString
{
	public static void main(int a) {
		System.out.println(1);
	}
}
