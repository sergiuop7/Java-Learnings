package Lab10;

import Lab10.Point;

import java.util.Random;

class Robot {
    private final String name;

    //Initial random position
    Random random = new Random();
    volatile Point location = new Point(random.nextInt(101), random.nextInt(101));

    public Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void move()
    {
        int x,y;
        do {
            x = random.nextInt(3) - 1;
            y = random.nextInt(3) - 1;
        }while (location.x + x > 100 || location.x + x < 0 || location.y + y > 100 || location.y + y < 0);

        this.location =  new Point(location.x + x, location.y+ y);

    }
}