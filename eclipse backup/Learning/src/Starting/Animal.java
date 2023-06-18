package Starting;

public class Animal {
	String name ;
	String type ;
	int age ;
	String favFood ;
	int cageNum ;
	
	
	
	
	public Animal(String name, String type, int age, String favFood, int cageNum) {
		
		this.name = name;
		this.type = type;
		this.age = age;
		this.favFood = favFood;
		this.cageNum = cageNum;
	}


	public void description() {
		System.out.println("My name is :"+ name);
		System.out.println("I am "+type);
		System.out.println("I am "+age);
		System.out.println("you can find me in cage number "+cageNum);
	}
	
	public void eat() {
		System.out.println("I love eating "+favFood);
	}
	
	public void sleep() {
		System.out.println("I take my naps in "+cageNum);
	}
}
