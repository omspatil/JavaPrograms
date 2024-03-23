
/*
interface Operation1
{
	public void add(int x,int y);
}
interface Operation2
{
	public void mul(int x,int y);
}

class Show_Operation implements Operation1,Operation2
{
	public void add(int a,int b)
	{
		System.out.println("Sum is "+(a+b));
	}
	public void mul(int a,int b)
	{
		System.out.println("Product is "+(a*b));
	}
}
class Main 
{
	public static void main(String args[])
	{
		Show_Operation op =new Show_Operation();
		op.add(100,200);
		op.mul(30,60);
	}	
}

/*
Output:
	C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo6.java

	C:\Users\kalegaonkar\Documents\Saved of Java>java Main
	Sum is 300
	Product is 1800

	C:\Users\kalegaonkar\Documents\Saved of Java>
*/

/*class NewClass {
	public static class superclass {
		static void print()
		{
			System.out.println("superclass method is called");
		}
	}
	public static class subclass extends superclass {
		static void print()
		{
			System.out.println("subclass method is called");
		}
	}
	public static void main(String[] args)
	{
		superclass A = new superclass();
		superclass B = new subclass();
		A.print();	//super method is called
		B.print();	// Here Also method of superclass is executed
	}
}
*/



// Main class
class NewClass
{
	public static class superclass { //Class 1
		void print() //Method of class 1
		{
			System.out.println("superclass method is called");
		}
	}
	public static class subclass extends superclass { //Class 2
		void print()
		{
			System.out.println("subclass method is called");
		}
	}

	// Method inside main class
	public static void main(String[] args)
	{
		// Creating object of inner class 1
		// with reference to constructor of super class
		superclass A = new superclass();

		// Creating object of inner class 1
		// with reference to constructor of sub class
		superclass B = new subclass();
		
		// Calling print() method over above objects
		A.print();
		B.print();
	}
}


