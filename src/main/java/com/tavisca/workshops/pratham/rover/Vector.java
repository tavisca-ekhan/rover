package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Vector {
        public final int x;
        public final int y;
        public final char direction;
        private static HashMap<Character, Character> rightMap
            = new HashMap<>();

    private static HashMap<Character, Character> leftMap
            = new HashMap<>();

        public Vector(int x, int y, char direction) {
            this.x = x;
            this.y = y;

            this.direction = direction;

            initalizeLeftMap();
            initalizeRightMap();
        }


    private void initalizeRightMap() {
        rightMap.put('N', 'E');
        rightMap.put('W', 'N');
        rightMap.put('S', 'W');
        rightMap.put('E', 'S');
    }

    private void initalizeLeftMap() {
        leftMap.put('N', 'W');
        leftMap.put('W', 'S');
        leftMap.put('S', 'E');
        leftMap.put('E', 'N');
    }

    public Vector turnLeft() {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }


    public Vector turnRight() {
        return new Vector(this.x, this.y, rightMap.get(this.direction));
    }

    public Vector move() {
        if (direction == 'N')
            return new Vector(this.x, this.y + 1, this.direction);
        else if (direction == 'E')
            return new Vector(this.x + 1, this.y, this.direction);
        else if (direction == 'W')
            return new Vector(this.x - 1, this.y, this.direction);
        else if (direction == 'S')
            return new Vector(this.x, this.y - 1,this.direction);

        return new Vector(this.x, this.y, this.direction);
    }
}
