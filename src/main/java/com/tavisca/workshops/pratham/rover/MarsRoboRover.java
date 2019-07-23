package com.tavisca.workshops.pratham.rover;

public class MarsRoboRover {
	public static void main(String[] args) {

		String currentPosition = "3 3 E";
		String commands = "MMRMMRMRRM";

		Rover rover = new Rover(currentPosition);

		for (char command : commands.toCharArray()) {
			rover.rove(command);
		}

		System.out.println("currentPosition..." + currentPosition);
		System.out.println("commands..." + commands);
		System.out.println("newPosition..." + rover.getX() + " " + rover.getY() + " " + rover.getDir());
	}

}
