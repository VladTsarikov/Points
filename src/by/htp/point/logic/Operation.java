package by.htp.point.logic;

import by.htp.point.entity.Point;

public class Operation {

	public static void moveTo(Point point,int x,int y, int t){
		if(point.getX()==0 && point.getY()==0){
			point.setS(Math.sqrt(Math.pow(x, 2)) + Math.pow(y,2));
		}
		else if(point.getX()==0){
			point.setS(Math.abs(y - point.getY()));
		}
		else if(point.getY()==0){
			point.setS(Math.abs(x - point.getX()));
		}
		else{ 
		point.setS(Math.sqrt(Math.pow(Math.abs(x - point.getX()), 2)) + Math.pow(Math.abs(y - point.getY()), 2));
		}
		point.setX(x);
		point.setY(y);
		point.setT(t);
		System.out.println("Coordinates of this point: " +"(" + point.getX() + "," + point.getY() + ")");
	}
	
	public static void coutUpSpeed(Point point){
		point.setV(point.getS()/point.getT());
		System.out.println("The velocity of the point is: " + point.getV());
	}
	
	public static void countUpAcceleration(Point point){
		point.setA(point.getV()/point.getT());
		System.out.println("Acceleration of the point is: " + point.getA());
	}
	
	public static void isCrossing(){
		
	}
	
	public static void countUpDistance(Point point1,Point point2){
		double d;
		if(point1.getX()==point2.getX()){
			d = Math.abs(point1.getY() - point2.getY());
		}
		else if(point1.getY()==point2.getY()){
			d = Math.abs(point1.getX() - point2.getX());
		}
		else{ 
		d = (Math.sqrt(Math.pow(Math.abs(point1.getX() - point2.getX()), 2)) + Math.pow(Math.abs(point1.getY() - point2.getY()), 2));
		}
		System.out.println("Distance between two points is " + d);
	}
}
