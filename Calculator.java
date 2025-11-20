package calsi;

public class Calculator {

	public static void main(String[] args) {
		add(10, 20);
		sub(20, 5);
		mul(40, 10);
		div(50, 5);
		mod(41, 2);

	}

	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void mod(int a,int b)
	{
		System.out.println(a%b);
	}
}
