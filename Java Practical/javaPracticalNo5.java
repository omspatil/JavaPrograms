class A
{
    static int sum;
    void add(int a,int b)
    {
       sum=a+b;
	   System.out.println("Values Added in Class A");
	   
    }
}
class B extends A{
    void show()
    {   System.out.println("Sum Printed in Class B");
        System.out.println(sum);
    }
}
 class Main
{
	public static void main(String[] args) {
		B ob1= new B();
		ob1.add(100,200);
		ob1.show();
	}
}

/* Output:
Values Added in Class A
Sum Printed in Class B
300
*/
//multilevel inheritance
/*class A
{   
	
    static int sum;
    void add(int a,int b)
    {   sum=a+b;
		System.out.println("Addition of Variables Done in Class A");
		
    }
}
class B extends A{
	static int p;
    void mul(int x,int y)
    {	
		p=x*y;
		System.out.println("Product of Variables Done in Class B");
        
    }
}

class C extends B{
    
    void show(){
        
        System.out.println("Sum & Product Printed In Class C");
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+p);
		
        
    }
}
 class Main
{
	public static void main(String[] args) {
		C ob1= new C();
		ob1.add(100,200);
		ob1.mul(100,200);
		ob1.show();
	}
}

/*C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo5.java

C:\Users\kalegaonkar\Documents\Saved of Java>java Main
Addition of Variables Done in Class A
Product of Variables Done in Class B
Sum & Product Printed In Class C
Sum: 300
Product: 20000
*/

/*class A
{
	void show(){
		System.out.println("Class A");
	}
}

class B extends A
{
	void print(){
		System.out.println("Class B inherits A ");
	}
}

class C extends A
{
	void print(){
		System.out.println("Class C inherits A ");
	}
}

class Main
{
	public static void main(String args[])
	{
		C ob1=new C();
		ob1.show();
		ob1.print();
		B ob2=new B();
		System.out.println();
		ob2.show();
		ob2.print();
	}	
}

/*C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo5.java

C:\Users\kalegaonkar\Documents\Saved of Java>java Main
Class A
Class C inherits A

Class A
Class B inherits A
*/
