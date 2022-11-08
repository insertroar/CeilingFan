package com.medavie.ceilingfan;
  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  

public class CeilingFan {
	
	private static final Logger logger = LogManager.getLogger(CeilingFan.class);  

	private int speed = 0;

	private Direction direction = Direction.INCREASE;

	public int getSpeed() {
		return speed;
	}	

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void speedIncrease() {
		
		speed++;
		
		if(speed>3) {
			speed = 0;
			logger.debug("Speed changed to 0");
		}
		
		logger.info("Speed changed to: " + speed);
	}

	public void reverseDirection() {
		direction = (direction == Direction.INCREASE) ? Direction.DECREASE : Direction.INCREASE;
		logger.info("Direction is reversed to: " + direction);
	}

	@Override
	public String toString() {
		return String.format("Ciling fan'speed is %d in %s direction", speed, direction);
	}
	
	public static void main(String[] args) {
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.speedIncrease();
	}
}