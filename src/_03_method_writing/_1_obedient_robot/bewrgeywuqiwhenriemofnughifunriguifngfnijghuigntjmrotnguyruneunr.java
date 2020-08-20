package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class bewrgeywuqiwhenriemofnughifunriguifngfnijghuigntjmrotnguyruneunr {
	static Robot Dude = new Robot();
public static void main(String[] args) {
	Dude.setSpeed(1000);
	
	Dude.penDown();
	drawTriangle();
	Dude.penUp();
	Dude.move(50);
	Dude.penDown();
	drawSquare();
	Dude.penUp();
	Dude.move(200);
    Dude.penDown();
	drawCircle();
}	


private static void drawTriangle() {
	// TODO Auto-generated method stub
	Dude.move(50);
	Dude.turn(120);
	Dude.move(50);
	Dude.turn(120);
	Dude.move(50);
	}


private static void drawSquare() {
	// TODO Auto-generated method stub
	
	for (int i = 0; i < 4; i++) {
	Dude.move(50);
	Dude.turn(90);
	}





}

private static void drawCircle() {
for (int i = 0; i < 360; i++) {
	Dude.move(1);
	Dude.turn(1);
	
	
}
Dude.hide();
	
	
	
	
}
}
