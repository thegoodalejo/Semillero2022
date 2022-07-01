package Entity;

public class Hotel extends Hosting {

	public Hotel(int floor, int roomNumber) {
		super(floor, roomNumber);
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}

	public void resume() {
		
		System.out.println("There are " + this.people.size() + " people in the Hotel ");
		System.out.println("***List of people***");
		
		for(Person person : this.people) {
			System.out.println(person.getName());
		}
	}
}
