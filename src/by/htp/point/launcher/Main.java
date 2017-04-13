package by.htp.point.launcher;

import by.htp.point.entity.Point;
import by.htp.point.logic.Operation;

public class Main {

	public static void main(String[] args){
		
		Point point1 = new Point("A");
		Point point2 = new Point("B");
		
		Operation.moveTo(point1, 3, 5, 3);
		Operation.moveTo(point2, 6, 3, 4);
		
		Operation.moveTo(point1, 7, 5, 3);
		Operation.moveTo(point2, 5, 6, 3);
		
		Operation.coutUpSpeed(point1);
		Operation.coutUpSpeed(point2);
		Operation.countUpAcceleration(point1);
		Operation.countUpAcceleration(point2);
		
		Operation.countUpDistance(point1, point2);
		
		Operation.isCrossing();
	}
}
