
//by making the class abstract, 
//you prevent users from instantiating an object of Machine
//why do that?
//because machine (here) is just a concept -- no reason to create it
//however, it gives common elements to its sub classes
//so it's good to have as a parent

public abstract class Machine {

	//let's say both Camera and Car share some properties:
	
	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//and all subclasses can have shared methods:
	
	public abstract void start();
	//but here it's abstract because generic "machine" doesn't have a way to start
	//each way something starts will be specific to the subclass
	//note the absence of {} -- ie, no body
	//you MUST create start methods in the sub classes, then
	
	public abstract void turnOff();
	//this is another abstract class
	//must also be created in sub classes
	
	//not all methods in an abstract class have to be abstract.
	//here's a method with a body (ie, not abstract)
	//it calls the two abstract methods above.
	public void run() {
		start();
		turnOff();
	}
	//non abstract methods do not need to be created in subclasses
	
	//does some of this look familiar?
	//because it's a lot like an interface.
	//when do you use each?
	//using abstract classes makes a strong statement that a child is a subset of a parent
	//ie, a car is clearly a type of machine
	//with an interface, it's more like an acknowledgement that some things have common elements
	//even if they are not related.
	//eg, lots of things can have ID numbers even if they are not related in any way
	//also, classes can implement many interfaces
	//but each child can extend only one parent
	//finally, abstract classes can include function (ie, methods with bodies)
	//interfaces leave all functionality to the "child" classes
	
}
