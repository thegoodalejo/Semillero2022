package Entity;

public class Hut extends Hosting{
	
	public Hut(int floor, int roomNumber) {
		super(floor, roomNumber);
	}
	
	public void addPerson(Person person) {
		this.people.add(person);
	}

	public void resume() {
		
		System.out.println("There are " + this.people.size() + " people in the Hut ");
		System.out.println("***List of people***");
		
		for(Person person : this.people) {
			System.out.println(person.getName());
		}
	}
	
}
