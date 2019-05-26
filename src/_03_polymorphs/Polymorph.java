package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
	private int y;
	private int width;
	private int height;
    
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
    
    public void setX(int a) {
    	if(a <= 0) {
    		x = 0;
    	}else {
    		x = a;
    	}
    }
    
    public void setY(int a) {
    	if(a <= 0) {
    		y = 0;
    	}else {
    		y = a;
    	}
    }
    
    public void setWidth(int a) {
    	width = a;
    }
    
    public void setHeight(int a) {
    	height = a;
    }
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
