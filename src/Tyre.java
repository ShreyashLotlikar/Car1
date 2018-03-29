
public class Tyre {

	public boolean rotate(int gear) {
		// TODO Auto-generated method stub
		if(gear>=1 && gear<=5)
			return true;
		else
		{
			System.out.println("Incorrect Gear");
			return false;
		}
		//System.out.println("Car iz Running.....Tyre Started rotating");

		
	}

}
