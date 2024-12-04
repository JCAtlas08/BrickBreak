import java.awt.*;

//
// Joshua Campbell
// 12/3/24
// This class creates the base of the sprite, pddle, containing its methods and behaviors/functionality in the game
//
public class Paddle {
	//Instance Variables
	private int x;
	private int y;
	private int velocity;
	private int width;
	private int height;
	
	//Constructor
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//Precondition: g is not null
	//Postcondition: the paddle is drawn white at x and y with the dimentions width*height
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}

	//Getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getVelocity() {
		return velocity;
	}

	//Setters
	public void setX(int newX) {
		x = newX;
	}
	public void setVelocity(int newVel) {
		velocity = newVel;
	}

	//Changers
	public void addVelocity(int a) {
		velocity += a;
	}

	//Movement
	public void move() {
		x += velocity;
		velocity *= 0.9;
	}

	
}
