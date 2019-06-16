package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class FollowMorph extends Polymorph{

	FollowMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void update() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int Mx = (int) b.getX();
		int My = (int) b.getY() - 50;
		int Xdisp = Mx -getX();
		int Ydisp = My -getY();
		int Tdisp = (int) Math.sqrt((Xdisp)*(Xdisp)+(Ydisp)*(Ydisp));
		if(Tdisp > 0) {
		setY((int) (getY()+10*Ydisp/Tdisp));
		setX((int) (getX()+10*Xdisp/Tdisp));
		}
	}
}
