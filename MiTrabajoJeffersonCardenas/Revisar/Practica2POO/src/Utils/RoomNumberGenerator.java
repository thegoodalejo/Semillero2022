package Utils;

public class RoomNumberGenerator {
	
	public static int generate(int floor, int roomNumber) {
		
		int numberTemp = 0;
		int floorTemp = 0;
		
		if(roomNumber > 99) {
			numberTemp = 99;
			
		}else if(roomNumber < 0) {
			numberTemp = 0;
			
		}else {
			numberTemp = roomNumber;
		}
		
		floorTemp = floor <= 0 ? 1 : floor;
		
		return (floorTemp * 100) + numberTemp;
	}

}
