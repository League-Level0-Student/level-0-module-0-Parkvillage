import org.jointheleague.graphical.robot.Robot;

public class robotgrafiti {
public static void main(String[] args) {
	Robot ned= new Robot();
	ned.setPenWidth(50);
	ned.turn(80);
	ned.setSpeed(60);
	ned.penDown();
	ned.move(30);
	ned.miniaturize();
	ned.setPenColor(30, 59, 67);
   for(int i=0; i<2; i++) {
	ned.setPenWidth(50);
	ned.turn(-80);
	ned.setSpeed(60);
	ned.penDown();
	ned.move(30);
	ned.setPenColor(78, 56, 21);
	
}
   ned.setPenColor(5, 69, 47);
   ned.turn(75);
   ned.move(40);
   ned.turn(90);
   ned.move(35);
   ned.penUp();
   ned.move(10);
   ned.turn(90);
   ned.move(70);
   ned.turn(170);
   ned.penDown();
   ned.setPenColor(63, 36, 58);
   for(int i=0; i<4; i++) {
	   ned.move(30);
	   ned.turn(90);
   }
   ned.setPenColor(1345, 46, 4);
   ned.turn(-275);
   ned.move(60);
   ned.turn(-90);
   ned.setRandomPenColor();
   ned.move(45);
   ned.turn(270);
   
	   
}   
}