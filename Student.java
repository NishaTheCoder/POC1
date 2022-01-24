/*1. Concept of Class and Object

i. Write a program to create 'student' class with rollNo and name as two instance variables.
ii. Create two objects student1,student2 for the Student class and assign any appropriate values to the objects.Display the Object content on a Console 
*/
------------------------------------------------------------------------------------------------
class Student 
{
	

    Student(String str,int rollno)
	{
		String name = str;
		int rollNo = rollno;

		System.out.println("Student Name:" +name);
        
		System.out.println("Student Roll No:" +rollNo);

		System.out.println();

	}


	public static void main(String[] args) 
	{

		Student Student1 = new Student("Nisha",15);
        Student Student2 = new Student("Sushmita",20);


	}
}

