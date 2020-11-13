package pong;

public class Sprite {
private int xPosition, yPosition, xVelocity, yVelocity, width, height;

public int getXPosition() { return xPosition;}
public int geYXPosition() { return yPosition;}
public int getXVelocity() { return xVelocity;}
public int getyVelocity() { return yVelocity;}

public int getWidth() { return width;}
public int getHeight() { return height;}

public int initialXPosition, initialYPosition;

public void setinitialPosition(int initialX, int initialY) {
	initialXPosition = initialX;
	initialYPosition = initialY;
}

public void resetToinitialPosition() {
	setXPosition(initialXPosition);
	setYPosition(initialYPosition);
}

public void setXPosition(int newX) {
	xPosition = newX;}


public void setXPosition(int newX, int panelWidth) {
	xPosition = newX;
	if (xPosition <0) {
		xPosition = 0;
	}
	else if (xPosition + width > panelWidth) {
		xPosition = panelWidth - width;
	}
}

public void setYPosition(int newY) {
	yPosition = newY;}

public void setYPosition(int newY, int panelHeight) {
	yPosition = newY;
	if (yPosition <0) {
		yPosition = 0;
	}
	else if (yPosition + height > panelHeight) {
		yPosition = panelHeight - height;
	}
}
public void setXVelocity(int newXVelocity) {
	xVelocity = newXVelocity;
}
public void setYVelocity(int newYVelocity) {
	xVelocity = newYVelocity;
}
public void setWidth(int newWidth) {
	width = newWidth;
}
public void setHeight(int newHeight) {
	height = newHeight;
}
