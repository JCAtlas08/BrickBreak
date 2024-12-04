import java.awt.*;

//
// Joshua Campbell
// 12/3/24
// This class creates the base of the sprite, ball, containing its methods and behaviors/functionality in the game 
//
public class Ball {
	//Instance Variables
	private int xPos;
	private int yPos;
	private int xVelocity;
	private int yVelocity;
	private int size;
	
	//Constructor
	public Ball(int xPos, int yPos, int size) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.size = size;
	}
	
	//Precondition: g is not null
	//Postcondition: the ball is drawn with the color white with size
	public void draw(Graphics g) {
		g.setColor(Color.white);
        g.fillOval(xPos, yPos, size, size);
	}

	//Getters
	public int getYpos() {
		return yPos;
	}
	public int getXpos() {
		return xPos;
	}
	public int getSize() {
		return size;
	}

	//Setters
	public void setY(int y) {
		yPos = y;
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setYVelocity(int yVel) {
		yVelocity = yVel;
	}
	public void setXVelocity(int xVel) {
		xVelocity = xVel;
	}

	//Reversals
	public void reverseY() {
		yVelocity *= -1;
	}
	public void reverseX() {
		xVelocity *= -1;
	}

	//Movement
	public void move() {
		xPos += xVelocity;
		yPos += yVelocity;
	}


}
