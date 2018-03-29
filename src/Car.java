
public class Car {
	 Engine	 engine = new Engine();
	 Tyre tyres = new Tyre();
	 Brake brake = new Brake();
	 Clutch clutch = new Clutch();
	 Ignition ignition = new Ignition();


	public boolean start(boolean clutch, boolean ignition) {
		// TODO Auto-generated method stub
		if(clutch == true && ignition == true)
		{
			engine.start(true,true);
			return true;
		}
		else
			return false;
		
	}

	public boolean move(int gear) {
		// TODO Auto-generated method stub
		//if car is started
		if(tyres.rotate(gear)==true)
			return true;
		else
			return false;
		
		
	}

	public void stop() {
		// TODO Auto-generated method stub
			brake.stop();
		
	} 

}
