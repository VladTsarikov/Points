package by.htp.point.entity;

public class Point {

	private String name;
	private int x;
	private int y;
	private int t;
	private double v;
	private double s;
	private double a;
	
	public Point(String name){
		this.name = name;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	
	
}
