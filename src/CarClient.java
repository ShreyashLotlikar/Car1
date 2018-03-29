
public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		if(myCar.start(true,true))
		{
			System.out.println("Your car Engine Started");
		}
		if(myCar.move(6)==true)
		{
			System.out.println("The car is moving in Gear 4");
		}
		else
			System.out.println("Wrong Gear");
		myCar.stop();

	}

}
