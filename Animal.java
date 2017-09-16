
public class Animal {
	Animal(){
		System.out.println("A new animal has been created!");
	}
	void sleep(){
		System.out.println("An animal sleep...");
		
	}
	void eat(){
		System.out.println("An animal eat...");
		
	}

}
class Bird extends Animal{
	Bird(){
		System.out.println("A new Bird has been created!");
	}
	void sleep(){
		System.out.println("An Bird sleep..."); 
	}
	void eat(){
		System.out.println("An Brid eat...");
	}

	
}

class Dog extends Animal{
	Dog(){
		System.out.println("A new Dog has been created!");
	}
	void sleep(){
		System.out.println("An Dog sleep...");
	}
	void eat(){
		System.out.println("An Dog eat...");
	}
}