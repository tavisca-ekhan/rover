package com.tavisca.workshops.pratham.rover;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial position and direction respectively: ");
        String position = scanner.nextLine();

        Rover rover = new Rover(Integer.parseInt(position.split(" ")[0]),
                                Integer.parseInt(position.split(" ")[1]),
                                position.charAt(4));

        System.out.println("Enter the sequence of movements: ");
        String movements = scanner.nextLine();

        for (char action : movements.toCharArray()) {
            rover = rover.rove(action);
        }

        System.out.println(rover.x + " " + rover.y + " " + rover.direction);
    }
}
