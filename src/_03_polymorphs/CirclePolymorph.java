package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	private double t = 0;
	
	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		setY((int) (getY()+10*Math.cos(t)+0.55));
		setX((int) (getX()+10*Math.sin(t)+0.5));
		t+=.2;
	}
	
}
