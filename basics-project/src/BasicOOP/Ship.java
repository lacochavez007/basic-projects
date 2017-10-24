package BasicOOP;

public class Ship {
	private double x,y,speed,direction;
	private String name;
	Ship(String intialName){
		this.x=0;
		this.y=0;
		this.speed=1.0;
		this.direction=0.0;
		this.name = intialName;
	}

	Ship(double initial_x, double initial_y,double initial_speed,double initial_direction, String initial_name){
		this.x = initial_x;
		this.y = initial_y;
		this.speed = initial_speed;
		this.direction = initial_direction;
		this.name = initial_name;
		
	}
	
	public void move() {
		 double angle = MathUtils.degreesToRadians(direction);
		this.x = this.x + speed * Math.cos(angle);	
		y = y + speed * Math.sin(angle);
		
	}
	
	public void printLocation() {
		System.out.println(name+" - is at  ("+x+" ,"+y+")");
				
	}
	
	public void setShipPosition(){
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
