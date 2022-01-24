/*2. Concept of method implementation
 Write a program to create 'Square' and 'Rectangle' class.
 i. Implement method to calculate area and perimeter of square and rectangles.
    These two methods are going to take side as argument in squre and length and breadth in case of rectangle.
ii. Create a 'MainClass' in which define main methode, in which create two object for each Squre and Rectangle class,
    Now calculate then show area and perimeter in the console after providing appropriate values for side,legth & bredth 
	using methods of these classes.
----------------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;

class Square1 
{
	float a,p;
	public void areaperi1(float s)
	{
        float c=s;
		a = c*c;
		p = 4*c;

		System.out.println("Area of Square:" +a);
		System.out.println("Perimeter of Square:" +p);


	}

	
}

class Rectangle1
{
	int a1,p1;
	public void areaperi2(int len,int b1)
	{
		int len1 = len;
		int b2 = b1;
		a1 = len1 * b2;
		p1 = 2 * (len1 + b2);

		System.out.println("Area of Rectangle:" +a1);
		System.out.println("Perimeter of Rectangle:" +p1);
	}

   
}

public class Que2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float s;
		int len,b1;

		System.out.println("Enter the side length of Square:");
		s = sc.nextFloat();

		System.out.println("Enter the length of rectangle:");
		len = sc.nextInt();

        System.out.println("Enter the bredth of rectangle:");
		b1 = sc.nextInt();

		
        Square1 sq = new Square1();
		Rectangle1 rec = new Rectangle1();


		sq.areaperi1(s);
		rec.areaperi2(len,b1);
	}
}
