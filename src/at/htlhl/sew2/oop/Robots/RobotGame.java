package at.htlhl.sew2.oop.Robots;

public class RobotGame {
    static void main() {
        // Robot 1
        Robot robot1 = new Robot("green", 75, true);

        // Robot 2
        Robot robot2 = new Robot("blue", -5000, true);

        // Robot 3
        Robot robot3 = new Robot("orange", 1000, false);

        // Print properties of all robots
        IO.println("Robot 1: " + robot1.getColor() + ", " + robot1.getEnergy() + ", " + robot1.isCanWalk());
        IO.println("Robot 2: " + robot2.getColor() + ", " + robot2.getEnergy() + ", " + robot2.isCanWalk());
        IO.println("Robot 3: " + robot3.getColor() + ", " + robot3.getEnergy() + ", " + robot3.isCanWalk());
    }
}
