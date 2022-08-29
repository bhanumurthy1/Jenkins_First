Class Demo
{
	int add(int a, int b)
	{
			return a+b;
		}
		int subtract(int a, int b)
	{
			return a-b;
			System.out.println("uaabtraction");
		}
		int multiply(int a, int b)
	{
			return a*b;
		}
		int divide(int a, int b)
	{
			return a/b;
		}

	public static void main(String args[])
	{
		int a,b,c,d,e,f;
		c=add(a,b);
		d=subtract(a,b);
		e=multiply(a,b);
		f=divide(a,b);
		System.out.println(“Addition:” + c + “Subtraction:” + d + “Multiplication:” + e + “Division:” + f)
	}
}
