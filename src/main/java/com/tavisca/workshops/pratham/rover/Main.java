package com.tavisca.workshops.pratham.rover;

public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover(3, 3, 'E');

        String movements = "MMRMMRMRRM";

        for (char action : movements.toCharArray()) {
            rover = rover.rove(action);
        }

        System.out.println(rover.x + " " + rover.y + " " + rover.direction);
    }
}
