package POO;
import robocode.*;

public class RobotPDOAER extends Robot
{
	
	public void run() {
		while(true){
		
			ahead(25);
			back(25);
			
			turnLeft(15);			
			turnRight(10);
		
		}
	}
	public void onHideWall(HitWallEvent event){
		setDebugProperty("Angulo de colisão", String.valueOf(event.getBearing())); 
		turnLeft(50);
		
		
	}
}
