/*import java.util.*;
class javaPracticalNo4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered Elements Are as Follows:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

/*C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo4.java

C:\Users\kalegaonkar\Documents\Saved of Java>java javaPracticalNo4
Enter Size of Array:
5
1 2 3 4 5
Entered Elements Are as Follows:
1 2 3 4 5
C:\Users\kalegaonkar\Documents\Saved of Java>*/

/*class javaPracticalNo4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No. of Rows & Columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter Elements:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Elements For Two Dimensional Array:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo4.java

C:\Users\kalegaonkar\Documents\Saved of Java>java javaPracticalNo4
Enter No. of Rows & Columns:
3 3
Enter Elements:
1 2 3 4 5 6 7 8 9
Entered Elements For Two Dimensional Array:
1 2 3
4 5 6
7 8 9*/

/*class javaPracticalNo4{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		int sum=0;
		
		for(int i=0;i<args.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of Command Line Arguments is: "+sum);
	}
}

/*C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo4.java

C:\Users\kalegaonkar\Documents\Saved of Java>java javaPracticalNo4 10 20 30 40 50 60 70
Sum of Command Line Arguments is: 280
*/

class javaPracticalNo4 {
	static int sum = 0;
	static int p = 1;

	static void product(int... a) {
		System.out.println("No. of Arguments passed: " + a.length);
		System.out.println("Entered Arguments are:");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			p *= a[i];
		}

	}

	static void sum(int... a) {

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

	}

	static void display() {
		System.out.println("Product of Given Arguments is: " + p);
		System.out.println("Sum of Given Arguments is: " + sum);
	}

	public static void main(String[] args) {
		product(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		display();
	}

}

/*
 * C:\Users\kalegaonkar\Documents\Saved of Java>javac javaPracticalNo4.java
 * 
 * C:\Users\kalegaonkar\Documents\Saved of Java>java javaPracticalNo4
 * No. of Arguments passed: 10
 * Entered Arguments are:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * Product of Given Arguments is: 3628800
 * Sum of Given Arguments is: 55
 */