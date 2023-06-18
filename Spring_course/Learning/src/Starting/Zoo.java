package Starting;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1= new Animal("Sheru","carnivorous",20,"deer",99);
		Animal s2 = new Animal("deer","herbivorous",39,"grass",78);
		Animal d3 = new Animal("boomer", "omnivorous", 15, "bones", 24);
		
		
		
		d3.description();
		d3.eat();
		d3.sleep();
		
		a1.description();
		a1.eat();
		a1.sleep();
		
		s2.description();
		s2.eat();
		s2.sleep();

	}

}
