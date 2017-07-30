package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Chumister= new Robot();
Chumister.penDown();
for(int i=0; i<4; i=i+1){
Chumister.move(100);
Chumister.turn(90);
	
}
		
	}
}
