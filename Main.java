abstract class Animal { 
	private String name; 
	
	public Animal(String name) { 
		this.name = name;
	} 
	
	public Animal() {
		System.out.println("Animal constructor called ");
	}
	abstract public String speak(); 
	
	public void display() { 
		System.out.println("My name is " + this.name + ". " + this.speak() + "."); 
	} 
} 
	class Dog extends Animal { 
		public Dog(String name) { 
			super(name); 
		} 
		
		public Dog() {
			System.out.println("Dog constructor called ");
		}
		public String speak() { 
			return "Bow Wow"; 
		} 
	}
	
	class Cat extends Animal { 
		public Cat(String name) { 
			super(name); 
		}
		
		public Cat() {
			System.out.println("Cat constructor called ");
		}
		
		public String speak() {
			return "Meow Meow"; 
		} 
	}
	
	class ToyCat extends Cat { 
		String manufacturer; 
	
			public ToyCat(String name, String manufacturer) { 
				super(name); 
				this.manufacturer = manufacturer; 
			} 
			public ToyCat() {
				System.out.print("ToyCat constructor called");
			}
			public void display() { 
				super.display(); System.out.println("I am from " + manufacturer + "."); 
			} 
	} 

class Main { 
	public static void main(String[] args) { 
		
	//Animal animal1 = new Animal("test"); 
	//animal1.display();
	
	Cat mycat = new Cat("Micky"); 
	mycat.display(); 
	
	Dog mydog = new Dog("Rover"); 
	mydog.display(); 
	
	ToyCat mytoy = new ToyCat("kittie","Toysrus"); 
	mytoy.display();
	
	ToyCat toy = new ToyCat();
	
	
	} 
}
	
