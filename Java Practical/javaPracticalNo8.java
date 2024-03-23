class TestGarbage1{  
	public void finalize()
	{
	System.out.println("Object is garbage collected");
	} 
	public static void main(String args[]){  
	TestGarbage1 s1=new TestGarbage1();  
	TestGarbage1 s2=new TestGarbage1();  
	s1=null;  
    System.out.println("First Object got Nullify");
	s2=null;  
    System.out.println("Second Object got Nullify");
	System.gc();  
 }  
}  
