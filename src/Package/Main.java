package Package;

public class Main {
    public static void main(String[] args) {
        /*Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.goBackward(100);
        tank.printPosition();*/

        /*Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();*/

        // В (0;0) с fuel = 100
        Tank justTank = new Tank();
        justTank.setName("T34-1");
        // В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 20);
        // В (20;30) с fuel = 200
        anywareTank.setName("T34-2");
        Tank customTank = new Tank(20, 30, 200);
        customTank.setName("T34-3");
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
