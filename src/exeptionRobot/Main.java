package exeptionRobot;

import robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new robot.Robot(Robot.Direction.RIGHT, -3, 2);

        Robot.moveRobot(robot,-3 , -5);

        System.out.println(robot.toString());
    }
}
