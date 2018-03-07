//abstract classes are used when a base class doesn't do anything itself
//example: Car and Camera are two sub classes of Machine.

public class Application {

	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();		
		car1.setId(4);
		
		//how about instantiating a new Machine?
		//you'll get an error because you made it abstract
		//see Machine tab for more info
		//Machine mech1 = new Machine();
		
		car1.run();
		cam1.run();
	}

}
