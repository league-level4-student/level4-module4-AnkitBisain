package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph[] poly = new Polymorph[7];

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		poly[0] = new BluePolymorph(0 * 50, 0 * 50, 10, 10);
		poly[1] = new RedPolymorph(1 * 50, 1 * 50, 10, 10);
		poly[2] = new MovingMorph(2 * 50, 2 * 50, 10, 10);
		poly[3] = new CirclePolymorph(3 * 50, 3 * 50, 10, 10);
		poly[4] = new BluePolymorph(4 * 50, 4 * 50, 10, 10);
		poly[5] = new FollowMorph(5 * 50, 5 * 50, 10, 10);
		poly[6] = new BluePolymorph(6 * 50, 6 * 50, 10, 10);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (int i = 0; i < poly.length; i++) {
			poly[i].draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (int i = 0; i < poly.length; i++) {
			poly[i].update();
		}
	}
}
