package com.tavisca.workshops.pratham.rover;

public class Rover {
    private int x;
    private int y;
    private String dir = "";


    Rover(String currentPosition) {
        String[] positions = currentPosition.split(" ");
        x = Integer.valueOf(positions[0]);
        y = Integer.valueOf(positions[1]);
        dir = positions[2];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getDir() {
        return this.dir;
    }

    private void moveLeft() {
        if (dir.equalsIgnoreCase("N"))
            dir = "W";
        else if (dir.equalsIgnoreCase("E"))
            dir = "N";
        else if (dir.equalsIgnoreCase("S"))
            dir = "E";
        else if(dir.equalsIgnoreCase("W"))
            dir = "S";
    }

    private void moveRight() {
        if (dir.equalsIgnoreCase("N"))
            dir = "E";
        else if (dir.equalsIgnoreCase("E"))
            dir = "S";
        else if (dir.equalsIgnoreCase("S"))
            dir = "W";
        else if(dir.equalsIgnoreCase("W"))
            dir = "N";
    }

    private void move() {
        if (dir.equalsIgnoreCase("N"))
            y++;
        else if (dir.equalsIgnoreCase("E"))
            x++;
        else if (dir.equalsIgnoreCase("S"))
            y--;
        else if(dir.equalsIgnoreCase("W"))
            x--;
    }

    public void rove(char command) {
        switch (command) {
            case 'L':
                moveLeft();
                break;
            case 'R':
                moveRight();
                break;
            case 'M':
                move();
                break;
        }
    }
}
