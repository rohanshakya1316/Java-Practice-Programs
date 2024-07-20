// Java code for using this() to
// invoke current class constructor
class ThisDemo1 {
	int a;
	int b;

	// Default constructor
	ThisDemo1()
	{
		this(10, 20);
		System.out.println(
			"Inside default constructor \n");
	}

	// Parameterized constructor
	ThisDemo1(int a, int b)
	{
		this.a = a;
		this.b = b;
        System.out.println("a = " + a + " b = " + b);
		System.out.println(
			"Inside parameterized constructor");
	}

	public static void main(String[] args)
	{
		// ThisDemo1 object = new ThisDemo1(100, 200);
        ThisDemo1 obj = new ThisDemo1();     
	}
}
