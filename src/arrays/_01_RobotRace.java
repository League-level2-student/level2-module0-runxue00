package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setY(550);
			robots[i].setX(200 * i + 50);
			robots[i].setSpeed(10);
		}
		Random r = new Random();
		boolean finished = false;
		while (finished == false) {
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() <= 0) {
					JOptionPane.showMessageDialog(null, "AND........     WE HAVE A WINNER!!!!!");
					finished = true;
					break;
				}
				robots[i].move(r.nextInt(49));
			}
		}

	}

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
