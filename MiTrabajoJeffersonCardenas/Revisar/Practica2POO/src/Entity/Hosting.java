package Entity;

import java.util.*;

import Utils.RoomNumberGenerator;

public abstract class Hosting {
	
	private int floor;
	private int roomNumber;
	protected List<Person> people = new ArrayList();
	
	public Hosting(int floor, int roomNumber) {
		
		this.floor = floor;
		this.roomNumber = RoomNumberGenerator.generate(floor, roomNumber);
		
	}
	
	public abstract void addPerson(Person person);
	
	public abstract void resume();

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
	
	
}
