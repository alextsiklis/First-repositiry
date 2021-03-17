package Package;

public class Tank {
    int x,y,i = 1,fuel;
    String Name;

    public Tank () {
        this(0,0,100);
    }

    public Tank(int x, int y) {
        this(x,y,100);
    }

    public Tank(int x, int y, int fuel){
        this.fuel = fuel;
        this.x = x;
        this.y = y;
    }

    public void turnRight() {
        if (i==4) {i=1;}
        else i += 1;
    }

    public void turnLeft() {
        if (i==1) {i=4;}
        else i -= 1;
    }

    public void goForward(int step) {
        if (fuel > 0){
            if (Math.abs(step) <= fuel) {
                if (i == 1) {
                    x += step;
                }
                if (i == 2) {
                    y += step;
                }
                if (i == 3) {
                    x -= step;
                }
                if (i == 4) {
                    y -= step;
                }
            }
            else {
                if (i == 1) {
                    x += fuel;
                }
                if (i == 2) {
                    y += fuel;
                }
                if (i == 3) {
                    x -= fuel;
                }
                if (i == 4) {
                    y -= fuel;
                }
            }
        }
        fuel-=Math.abs(step);
    }

    public void goBackward(int step) {
        goForward(-step);
    }

    public void printPosition() {
        System.out.println("The " + Name + " is at " + x + ", " + y + " now.");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
