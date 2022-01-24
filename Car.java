/*3. Initialize On Object Creation
    i.Create a class Car which contain wheels and model as Instance variables.
   ii.Initialize the number of wheels of the car at the time of creating the object of thecar and assign the model of the
      car to the model varible and print the model after creating the object of the class(not at the time of creating the object).

*/

class Car 
{
    
	String model;
	int wheels;
	
	public Car(int whellNo)
	{
		int wheels = whellNo;
		
		System.out.println("Car wheels number:"+wheels);

	}


	public static void main(String[] args) 
	{
	    
          Car c1 = new Car(4);
          String model = "Maruti Suzuki Swift";
		  
		  System.out.println("Car model name:"+model);
	}
}
