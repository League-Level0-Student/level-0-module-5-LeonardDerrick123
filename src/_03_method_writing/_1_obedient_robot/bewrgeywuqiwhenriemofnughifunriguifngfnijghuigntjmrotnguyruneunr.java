package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class bewrgeywuqiwhenriemofnughifunriguifngfnijghuigntjmrotnguyruneunr {
	static Robot Dude = new Robot();
public static void main(String[] args) {
	Dude.setSpeed(10000);
	String GYUiio = JOptionPane.showInputDialog("which color do you whant");
	if(GYUiio.equalsIgnoreCase("red")) {
		Dude.setPenColor(Color.red);
	}
	else if(GYUiio.equalsIgnoreCase("blue")) {
		Dude.setPenColor(Color.blue);
	}
	else if(GYUiio.equalsIgnoreCase("green")) {
		Dude.setPenColor(Color.green);
	}
	else {
		Dude.setRandomPenColor();
	}
	String ghT = JOptionPane.showInputDialog("which shape do you whant");
	Dude.penDown();
	if(ghT.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if(ghT.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(ghT.equalsIgnoreCase("circle")) {
		drawCircle();
	}
	else{
	JOptionPane.showMessageDialog(null,"Sorry we dont have that shape")	;
	}
Dude.hide();
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
