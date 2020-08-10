package robot;


/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами:
 * X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p>
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит:
 * вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * <p>
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */
// решено

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(Robot.Direction.RIGHT, -3, 2);

        Robot.moveRobot(robot,-3 , -5);

        System.out.println(robot.toString());

    }



}