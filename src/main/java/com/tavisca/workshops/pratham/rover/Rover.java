package com.tavisca.workshops.pratham.rover;

public class Rover {
    public Vector vector;
    public int x;
    public int y;
    public char direction;

    Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        vector = new Vector(x, y, direction);
    }

    public Rover rove(char action) {
        switch (action) {
            case 'M':
                vector = vector.move();
                break;
            case 'R':
                vector = vector.turnRight();
                break;
            case 'L':
                vector = vector.turnLeft();
                break;
        }

        return new Rover(vector.x, vector.y, vector.direction);
    }
}
