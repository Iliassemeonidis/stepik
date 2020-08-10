package exeptionRobot;

public class Robot {
    private robot.Robot.Direction direction;
    private int X, Y;

    public Robot(robot.Robot.Direction direction, int x, int y) {
        this.direction = direction;
        this.X = x;
        this.Y = y;
    }

    public robot.Robot.Direction getDirection() {

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
                direction = robot.Robot.Direction.LEFT;
                break;
            case DOWN:
                direction = robot.Robot.Direction.RIGHT;
                break;
            case LEFT:
                direction = robot.Robot.Direction.DOWN;
                break;
            case RIGHT:
                direction = robot.Robot.Direction.UP;

        }


    }

    public void turnRight() {

        switch (direction) {
            case RIGHT:
                direction = robot.Robot.Direction.DOWN;
                break;
            case LEFT:
                direction = robot.Robot.Direction.UP;
                break;
            case DOWN:
                direction = robot.Robot.Direction.LEFT;
                break;
            case UP:
                direction = robot.Robot.Direction.RIGHT;
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
      int dx = robot.getX() - toX, dy = robot.getY() - toY;

      Direction dirX = dx > 0 ? Direction.LEFT : Direction.RIGHT;
      Direction dirY = dy > 0 ? Direction.DOWN : Direction.UP;

      dx = Math.abs(dx);
      dy = Math.abs(dy);

      while (!robot.getDirection().equals(dirX)) robot.turnRight();
      while (dx-- > 0) robot.stepForward();

      while (!robot.getDirection().equals(dirY)) robot.turnRight();
      while (dy-- > 0) robot.stepForward();
  }


}
