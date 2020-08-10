package robot;

import java.util.Spliterator;
import java.util.stream.IntStream;


public class Robot {
    private Direction direction;
    private int X, Y;

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.X = x;
        this.Y = y;
    }

    public Direction getDirection() {

        return direction;
    }

    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    public void turnLeft() {

        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;

        }


    }

    public void turnRight() {

        switch (direction) {
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;

        }

    }

    public void stepForward() {
        switch (direction) {
            case UP:
                this.Y++;
                break;
            case DOWN:
                this.Y--;
                break;
            case LEFT:
                this.X--;
                break;
            case RIGHT:
                this.X++;
                break;

        }
    }


    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    @Override
    public String toString() {
        return "Robot " +
                "direction=" + direction +
                ", X=" + X +
                ", Y=" + Y;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        //  тут  определяем куда смотрит робот и куда вертеть робота

        if (toX > 0 && toX > robot.getX()) {
            if (!robot.getDirection().equals(Direction.RIGHT)) {
                while (!robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                }

            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

        } else if (toX > 0 && toX < robot.getX()) {
            if (!robot.getDirection().equals(Direction.LEFT)) {
                while (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }

            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (toX <= 0 && toX < robot.getX()) {
            if (!robot.getDirection().equals(Direction.LEFT)) {
                while (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (toX <= 0 && toX > robot.getX()) {
            if (!robot.getDirection().equals(Direction.RIGHT)) {
                while (!robot.getDirection().equals(Direction.RIGHT)) {

                    robot.stepForward();
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY > 0 && toY > robot.getY()) {
            if (!robot.getDirection().equals(Direction.UP)) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY > 0 && toY < robot.getY()) {
            if (!robot.getDirection().equals(Direction.DOWN)) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY <= 0 && toY < robot.getY()) {
            if (!robot.getDirection().equals(Direction.DOWN)) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY <= 0 && toY > robot.getY()) {
            if (!robot.getDirection().equals(Direction.UP)) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnLeft();
                }
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }


    }
}
/**
 * это супер волшебное решение
 *
 * public static void moveRobot(Robot robot, int toX, int toY) {
 *     int dx = robot.getX() - toX, dy = robot.getY() - toY;
 *
 *     Direction dirX = dx > 0 ? Direction.LEFT : Direction.RIGHT;
 *     Direction dirY = dy > 0 ? Direction.DOWN : Direction.UP;
 *
 *     dx = Math.abs(dx);
 *     dy = Math.abs(dy);
 *
 *     while (!robot.getDirection().equals(dirX)) robot.turnRight();
 *     while (dx-- > 0) robot.stepForward();
 *
 *     while (!robot.getDirection().equals(dirY)) robot.turnRight();
 *     while (dy-- > 0) robot.stepForward();
 * }
 */